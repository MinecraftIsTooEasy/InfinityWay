package huix.infinity.common.world.item;

import huix.infinity.common.world.item.tier.IFWTier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class BattleAxeTool extends AxeTool {
    public BattleAxeTool(IFWTier tier, Properties properties) {
        super(tier, 5, properties);
    }

    @Override
    public float getBaseHarvestEfficiency(BlockState state) {
        return super.getBaseHarvestEfficiency(state) * 0.75F;
    }

    @Override
    public float getDecayRateForBreakingBlock(BlockState state) {
        return super.getDecayRateForBreakingBlock(state) * 1.25F;
    }

    @Override
    public float getDecayRateForAttackingEntity(ItemStack stack) {
        return super.getDecayRateForAttackingEntity(stack) * 0.75F;
    }
}
