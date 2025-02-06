package huix.infinity.common.world.entity.animal;

import huix.infinity.attachment.IFWAttachments;
import huix.infinity.common.world.entity.LivingEntityAccess;
import huix.infinity.common.world.entity.ai.MoveToItemGoals;
import huix.infinity.common.world.entity.ai.SeekFoodIfHungryGoal;
import huix.infinity.common.world.entity.ai.SeekWaterIfThirstyGoal;
import huix.infinity.common.world.item.IFWItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public abstract class Livestock extends Animal {
    private final static EntityDataAccessor<Boolean> IS_WELL = SynchedEntityData.defineId(Livestock.class, EntityDataSerializers.BOOLEAN);
    private final static EntityDataAccessor<Boolean> IS_THIRSTY = SynchedEntityData.defineId(Livestock.class, EntityDataSerializers.BOOLEAN);


    protected Livestock(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
        finalizeSpawn();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MoveToItemGoals(this, this::isFood, 16));
        this.goalSelector.addGoal(2, new SeekFoodIfHungryGoal(this));
        this.goalSelector.addGoal(2, new SeekWaterIfThirstyGoal(this));
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (!this.level().isClientSide && !this.isBaby() && !this.isDesperateForFood()) {
            addManureCountdown(-1);
            if (this.getManureCountdown() <= 0) {
                this.spawnAtLocation(IFWItems.manure);
                this.gameEvent(GameEvent.ENTITY_PLACE);
                this.setManureCountdown(this.getManurePeriod() / 2 + this.random.nextInt(this.getManurePeriod()));
            }
        }
    }

    @Override
    public void defineSynchedData(SynchedEntityData.@NotNull Builder builder) {
        super.defineSynchedData(builder);
        builder.define(IS_WELL, true);
        builder.define(IS_THIRSTY, false);
    }

    @Override
    public boolean canPickUpLoot() {
        return true;
    }

    @Override
    public boolean wantsToPickUp(@NotNull ItemStack stack) {
        return this.isFood(stack);
    }

    @Override
    public void pickUpItem(@NotNull ItemEntity itemEntity) {
        if (isFood(itemEntity.getItem()) &&
                ((LivingEntityAccess) this).getFoodOrRepairItemPickupCoolDown() == 0 &&
                (this.canFallInLove() || this.isBaby())) {
            ItemStack itemstack = itemEntity.getItem();
            this.onItemPickup(itemEntity);
            this.take(itemEntity, 1);
            itemstack.shrink(1);
            if (itemstack.isEmpty()) {
                itemEntity.discard();
            }
            this.addFood(1);
            int age = this.getAge();
            if (!this.level().isClientSide && age == 0 && this.canFallInLove()) {
                this.setInLove(null);
            }

            if (this.isBaby()) {
                this.ageUp(getSpeedUpSecondsWhenFeeding(-age), true);
            }
            ((LivingEntityAccess) this).setFoodOrRepairItemPickupCoolDown(400);
        }
    }

    @Override
    protected int getBaseExperienceReward() {
        return 0;
    }

    protected void finalizeSpawn() {
        this.food(0.8F + this.random.nextFloat() * 0.2F);
        this.water(0.8F + this.random.nextFloat() * 0.2F);
        this.freedom(0.8F + this.random.nextFloat() * 0.2F);
        this.setManurePeriod(24000);
        this.setManureCountdown((int) (Math.random() * this.getManurePeriod()));
    }

    private void water(float water) {
        if (!this.level().isClientSide()) {
            this.setData(IFWAttachments.water, Mth.clamp(water, 0.0F, 1.0F));
            this.setIsWell(this.isWell());
            this.setIsThirsty(this.isThirsty());
        }
    }

    private void food(float food) {
        if (!this.level().isClientSide()) {
            this.setData(IFWAttachments.food, Mth.clamp(food, 0.0F, 1.0F));
            this.setIsWell(this.isWell());
        }
    }

    private void freedom(float freedom) {
        if (!this.level().isClientSide()) {
            this.setData(IFWAttachments.freedom, Mth.clamp(freedom, 0.0F, 1.0F));
            this.setIsWell(this.isWell());
        }
    }

    public int getManurePeriod() {
        return this.getData(IFWAttachments.manure_period);
    }

    protected void setManurePeriod(int manure_period) {
        if (!this.level().isClientSide()) {
            this.setData(IFWAttachments.manure_period, manure_period);
        }
    }

    public int getManureCountdown() {
        return this.getData(IFWAttachments.manure_countdown);
    }

    protected void setManureCountdown(int manure_countdown) {
        if (!this.level().isClientSide()) {
            this.setData(IFWAttachments.manure_countdown, manure_countdown);
        }
    }

    protected void addManureCountdown(int i) {
        this.setData(IFWAttachments.manure_countdown,
                this.getData(IFWAttachments.manure_countdown) + i);
    }

    public float water() {
        return this.getData(IFWAttachments.water);
    }

    public float food() {
        return this.getData(IFWAttachments.food);
    }

    public float freedom() {
        return this.getData(IFWAttachments.freedom);
    }

    public int productionCounter() {
        return this.getData(IFWAttachments.production_counter);
    }

    protected void setProductionCounter(int production_counter) {
        if (!this.level().isClientSide()) {
            this.setData(IFWAttachments.production_counter, production_counter);
        }
    }

    protected void addProductionCounter(int i) {
        this.setProductionCounter(this.getData(IFWAttachments.production_counter) + i);
    }

    protected boolean isPanic() {return this.getData(IFWAttachments.is_panic);}

    protected void setPanic(boolean isPanic) {this.setData(IFWAttachments.is_panic, isPanic);}

    protected void addFood(float food) {
        this.food(this.food() + food);
    }

    protected void addWater(float water) {
        this.water(this.water() + water);
    }

    protected void addFreedom(float freedom) {
        this.freedom(this.freedom() + freedom);
    }

    public void setIsWell(boolean isWell) {
        this.getEntityData().set(IS_WELL, isWell);
    }

    public void setIsThirsty(boolean isThirsty) {
        this.getEntityData().set(IS_THIRSTY, isThirsty);
    }

    public boolean isThirsty() {
        if (this.level().isClientSide()) {
            return this.getEntityData().get(IS_THIRSTY);
        } else {
            return this.water() < 0.5F;
        }
    }

    public boolean isWell() {
        if (this.level().isClientSide()) {
            return this.getEntityData().get(IS_WELL);
        } else {
            return Math.min(this.freedom(), Math.min(this.food(), this.water())) >= 0.25F;
        }
    }

    public boolean isHungry() {
        return this.food() < 0.5F;
    }

    public boolean isVeryHungry() {
        return this.food() < 0.25F;
    }

    public boolean isDesperateForFood() {
        return this.food() < 0.05F;
    }

    public boolean isVeryThirsty() {
        return this.water() < 0.25F;
    }

    public boolean isDesperateForWater() {
        return this.water() < 0.05F;
    }


    public Set<Block> getFoodBlocks() {
        return Set.of(
            Blocks.GRASS_BLOCK,
            Blocks.SHORT_GRASS, Blocks.TALL_GRASS,
            Blocks.FERN, Blocks.LARGE_FERN
        );
    }

    protected boolean isNearFood() {
        return isNearFood(this.blockPosition());
    }

    protected boolean isNearFood(BlockPos pos) {
        return isNearFood(pos.getX(), pos.getY(), pos.getZ());
    }

    protected boolean isNearFood(int x, int y, int z) {
        int height = Mth.floor(this.getBbHeight());
        for (int dx = -1; dx <= 1; ++dx) {
            for (int dy = -1; dy <= height; ++dy) {
                for (int dz = -1; dz <= 1; ++dz) {
                    if (getFoodBlocks().contains(this.level().getBlockState(
                            new BlockPos(x + dx, y + dy, z + dz)).getBlock())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isCrowded() {
        return this.level().getEntitiesOfClass(LivingEntity.class,
                this.getBoundingBox().expandTowards(2.0, 0.5, 2.0)).size() > 2;
    }

    public int getLight() {
        return this.level().getBlockState(this.blockPosition()).getLightBlock(
                this.level(), this.blockPosition()
        );
    }

    protected boolean updateWellness() {
        float benefit = 0.1f;
        float penalty = -0.005f;

        if (isNearFood()) {
            this.addFood(benefit);
        } else {
            this.addFood(penalty);
        }

        if (this.isInWater()) {
            this.addWater(benefit);
        } else if (this.isInRain()) {
            this.addWater(benefit / 10.0F);
        } else {
            this.addWater(penalty);
        }

        if (this.getLight() >= 7 || !this.isCrowded()) {
            this.addFreedom(benefit);
        } else {
            this.addFreedom(penalty);
        }
        return this.isWell();
    }

    public boolean hasFullHealth() {
        return this.getHealth() == this.getMaxHealth();
    }
}
