package huix.infinity.mixin.inventory;

import huix.infinity.util.IFWEnchantmentHelper;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.EnchantmentMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;
import java.util.stream.Stream;

@Mixin( EnchantmentMenu.class )
public class EnchantmentMenuMixin {
    @Unique
    private final int ifw_enchantingMultiplier = 2;

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;getEnchantmentCost(Lnet/minecraft/util/RandomSource;IILnet/minecraft/world/item/ItemStack;)I"),
            method = "lambda$slotsChanged$0")
    private int redirectEnchantmentCosts(RandomSource randomSource, int k, int enchantNum, ItemStack power) {
        return IFWEnchantmentHelper.getExperienceCost(IFWEnchantmentHelper.calculateRequiredExperienceLevel(randomSource, k, enchantNum, power, this.ifw_enchantingMultiplier));
    }

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;selectEnchantment(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/item/ItemStack;ILjava/util/stream/Stream;)Ljava/util/List;"),
            method = "getEnchantmentList")
    private List<EnchantmentInstance> redirectEnchantmentList(RandomSource randomSource, ItemStack stack, int cost, Stream<Holder<Enchantment>> stream) {
        return IFWEnchantmentHelper.selectEnchantment(randomSource, stack, cost, stream);
    }

    @Redirect(at = @At(value = "FIELD", target = "Lnet/minecraft/world/entity/player/Player;experienceLevel:I"),
            method = "clickMenuButton")
    private int redirectEnchantmentLevel(Player instance) {
        return instance.totalExperience;
    }

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;isEmpty()Z"), method = "clickMenuButton")
    private boolean redirectLapisStack(ItemStack instance) {
        return false;
    }

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getCount()I"), method = "clickMenuButton")
    private int redirectLapisCount(ItemStack instance) {
        return 5;
    }

    @Shadow
    @Final
    public int[] costs;

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;onEnchantmentPerformed(Lnet/minecraft/world/item/ItemStack;I)V"), method = "lambda$clickMenuButton$1")
    private void redirectXPCost(Player instance, ItemStack enchantedItem, int levelCost) {
        instance.onEnchantmentPerformedPoints(enchantedItem, this.costs[levelCost - 1]);
    }
}
