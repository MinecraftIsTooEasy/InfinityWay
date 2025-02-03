package huix.infinity.datagen.lang;

import huix.infinity.common.world.block.IFWBlocks;
import huix.infinity.common.world.item.IFWItems;
import huix.infinity.init.InfinityWay;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class IFWUSLanguageProvider extends LanguageProvider {
    public IFWUSLanguageProvider(PackOutput output) {
        super(output, InfinityWay.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("foodtips.saturation", "+%s Saturation Value");
        add("foodtips.nutrition", "+%s  Food Value");
        add("foodtips.protein", "+%s Protein Value");
        add("foodtips.phytonutrients", "+%s Phytonutrients Value");
        add("foodtips.insulinresponse", "+%s Insulin Response");

        //Blocks
        add(IFWBlocks.adamantium_block_item.get(), "Adamantium Block");
        add(IFWBlocks.adamantium_ore_item.get(), "Adamantium Ore");
        add(IFWBlocks.adamantium_bars_item.get(), "Adamantium Bars");
        add(IFWBlocks.adamantium_door_item.get(), "Adamantium Door");
        add(IFWBlocks.mithril_block_item.get(), "Mithril Block");
        add(IFWBlocks.mithril_ore_item.get(), "Mithril Ore");
        add(IFWBlocks.mithril_bars_item.get(), "Mithril Bars");
        add(IFWBlocks.mithril_door_item.get(), "Mithril Door");
        add(IFWBlocks.ancient_metal_block_item.get(), "Ancient Metal Block");
        add(IFWBlocks.ancient_metal_bars_item.get(), "Ancient Metal Bars");
        add(IFWBlocks.ancient_metal_door_item.get(), "Ancient Metal Door");
        add(IFWBlocks.gold_bars_item.get(), "Gold Bars");
        add(IFWBlocks.gold_door_item.get(), "Gold Door");
        add(IFWBlocks.silver_block_item.get(), "Silver Block");
        add(IFWBlocks.silver_ore_item.get(), "Silver Ore");
        add(IFWBlocks.silver_bars_item.get(), "Silver Bars");
        add(IFWBlocks.silver_door_item.get(), "Silver Door");
        add(IFWBlocks.copper_bars_item.get(), "Copper Bars");
        add(IFWBlocks.copper_door_item.get(), "Copper Door");
        add(IFWBlocks.raw_adamantium_block_item.get(), "Raw Adamantium Block");
//        add(IFWBlocks.raw_mithril_block_item.get(), "Raw Mithril Block");
        add(IFWBlocks.raw_silver_block_item.get(), "Raw Silver Block");
        add(IFWBlocks.deepslate_adamantium_ore_item.get(), "Deepslate Adamantium Ore");
        add(IFWBlocks.deepslate_mithril_ore_item.get(), "Deepslate Mithril Ore");
        add(IFWBlocks.deepslate_silver_ore_item.get(), "Deepslate Silver Ore");

        //Items
        add(IFWItems.sinew.get(), "Sinew");
        add(IFWItems.salad.get(), "Salad");
        add(IFWItems.milk_bowl.get(), "Milk of Bowl");
        add(IFWItems.water_bowl.get(), "Water of Bowl");
        add(IFWItems.cheese.get(), "Cheese");
        add(IFWItems.dough.get(), "Dough");
        add(IFWItems.chocolate.get(), "Chocolate");
        add(IFWItems.cereal.get(), "Cereal");
        add(IFWItems.pumpkin_soup.get(), "Pumpkin Soup");
        add(IFWItems.mushroom_soup_cream.get(), "Mushroom Soup Cream");
        add(IFWItems.vegetable_soup.get(), "Vegetable Soup");
        add(IFWItems.vegetable_soup_cream.get(), "Vegetable Soup Cream");
        add(IFWItems.chicken_soup.get(), "Chicken Soup");
        add(IFWItems.beef_stew.get(), "Beef Stew");
        add(IFWItems.porridge.get(), "Porridge");
        add(IFWItems.sorbet.get(), "Sorbet");
        add(IFWItems.mashed_potato.get(), "Mashed Potato");
        add(IFWItems.ice_cream.get(), "Ice Cream");
        add(IFWItems.orange.get(), "Orange");
        add(IFWItems.banana.get(), "Banana");
        add(IFWItems.cooked_worm.get(), "Cooked Worm");
        add(IFWItems.worm.get(), "Worm");
        add(IFWItems.flint_shard.get(), "Flint Shard");
        add(IFWItems.obsidian_shard.get(), "Obsidian Shard");
        add(IFWItems.glass_shard.get(), "Glass Shard");
        add(IFWItems.emerald_shard.get(), "Emerald Shard");
        add(IFWItems.diamond_shard.get(), "Diamond Shard");
        add(IFWItems.quartz_shard.get(), "Quartz Shard");
        add(IFWItems.raw_adamantium.get(), "Raw Adamantium");
        add(IFWItems.raw_mithril.get(), "Raw Mithril");
        add(IFWItems.raw_silver.get(), "Raw Silver");
        add(IFWItems.adamantium_ingot.get(), "Adamantium Ingot");
        add(IFWItems.adamantium_pickaxe.get(), "Adamantium Pickaxe");
        add(IFWItems.adamantium_nugget.get(), "Adamantium Nugget");
        add(IFWItems.adamantium_shears.get(), "Adamantium Shears");
        add(IFWItems.adamantium_shovel.get(), "Adamantium Shovel");
        add(IFWItems.adamantium_hoe.get(), "Adamantium Hoe");
        add(IFWItems.adamantium_sword.get(), "Adamantium Sword");
        add(IFWItems.adamantium_axe.get(), "Adamantium Axe");
        add(IFWItems.adamantium_scythe.get(), "Adamantium Scythe");
        add(IFWItems.adamantium_mattock.get(), "Adamantium Mattock");
        add(IFWItems.adamantium_battle_axe.get(), "Adamantium Battle Axe");
        add(IFWItems.adamantium_war_hammer.get(), "Adamantium War Hammer");
        add(IFWItems.adamantium_dagger.get(), "Adamantium Dagger");
        add(IFWItems.mithril_ingot.get(), "Mithril Ingot");
        add(IFWItems.mithril_pickaxe.get(), "Mithril Pickaxe");
        add(IFWItems.mithril_nugget.get(), "Mithril Nugget");
        add(IFWItems.mithril_shears.get(), "Mithril Shears");
        add(IFWItems.mithril_shovel.get(), "Mithril Shovel");
        add(IFWItems.mithril_hoe.get(), "Mithril Hoe");
        add(IFWItems.mithril_sword.get(), "Mithril Sword");
        add(IFWItems.mithril_axe.get(), "Mithril Axe");
        add(IFWItems.mithril_scythe.get(), "Mithril Scythe");
        add(IFWItems.mithril_mattock.get(), "Mithril Mattock");
        add(IFWItems.mithril_battle_axe.get(), "Mithril Battle Axe");
        add(IFWItems.mithril_war_hammer.get(), "Mithril War Hammer");
        add(IFWItems.mithril_dagger.get(), "Mithril Dagger");
        add(IFWItems.ancient_metal_ingot.get(), "Ancient Metal Ingot");
        add(IFWItems.ancient_metal_pickaxe.get(), "Ancient Metal Pickaxe");
        add(IFWItems.ancient_metal_nugget.get(), "Ancient Metal Nugget");
        add(IFWItems.ancient_metal_shears.get(), "Ancient Metal Shears");
        add(IFWItems.ancient_metal_shovel.get(), "Ancient Metal Shovel");
        add(IFWItems.ancient_metal_hoe.get(), "Ancient Metal Hoe");
        add(IFWItems.ancient_metal_sword.get(), "Ancient Metal Sword");
        add(IFWItems.ancient_metal_axe.get(), "Ancient Metal Axe");
        add(IFWItems.ancient_metal_scythe.get(), "Ancient Metal Scythe");
        add(IFWItems.ancient_metal_mattock.get(), "Ancient Metal Mattock");
        add(IFWItems.ancient_metal_battle_axe.get(), "Ancient Metal Battle Axe");
        add(IFWItems.ancient_metal_war_hammer.get(), "Ancient Metal War Hammer");
        add(IFWItems.ancient_metal_dagger.get(), "Ancient Metal Dagger");
        add(IFWItems.silver_ingot.get(), "Silver Ingot");
        add(IFWItems.silver_pickaxe.get(), "Silver Pickaxe");
        add(IFWItems.silver_nugget.get(), "Silver Nugget");
        add(IFWItems.silver_shears.get(), "Silver Shears");
        add(IFWItems.silver_shovel.get(), "Silver Shovel");
        add(IFWItems.silver_hoe.get(), "Silver Hoe");
        add(IFWItems.silver_sword.get(), "Silver Sword");
        add(IFWItems.silver_axe.get(), "Silver Axe");
        add(IFWItems.silver_scythe.get(), "Silver Scythe");
        add(IFWItems.silver_mattock.get(), "Silver Mattock");
        add(IFWItems.silver_battle_axe.get(), "Silver Battle Axe");
        add(IFWItems.silver_war_hammer.get(), "Silver War Hammer");
        add(IFWItems.silver_dagger.get(), "Silver Dagger");
        add(IFWItems.copper_pickaxe.get(), "Copper Pickaxe");
        add(IFWItems.copper_nugget.get(), "Copper Nugget");
        add(IFWItems.copper_shears.get(), "Copper Shears");
        add(IFWItems.copper_shovel.get(), "Copper Shovel");
        add(IFWItems.copper_hoe.get(), "Copper Hoe");
        add(IFWItems.copper_sword.get(), "Copper Sword");
        add(IFWItems.copper_axe.get(), "Copper Axe");
        add(IFWItems.copper_scythe.get(), "Copper Scythe");
        add(IFWItems.copper_mattock.get(), "Copper Mattock");
        add(IFWItems.copper_battle_axe.get(), "Copper Battle Axe");
        add(IFWItems.copper_war_hammer.get(), "Copper War Hammer");
        add(IFWItems.copper_dagger.get(), "Copper Dagger");
        add(IFWItems.rusted_iron_pickaxe.get(), "Rusted Iron Pickaxe");
        add(IFWItems.rusted_iron_shears.get(), "Rusted Iron Shears");
        add(IFWItems.rusted_iron_shovel.get(), "Rusted Iron Shovel");
        add(IFWItems.rusted_iron_hoe.get(), "Rusted Iron Hoe");
        add(IFWItems.rusted_iron_sword.get(), "Rusted Iron Sword");
        add(IFWItems.rusted_iron_axe.get(), "Rusted Iron Axe");
        add(IFWItems.rusted_iron_scythe.get(), "Rusted Iron Scythe");
        add(IFWItems.rusted_iron_mattock.get(), "Rusted Iron Mattock");
        add(IFWItems.rusted_iron_battle_axe.get(), "Rusted Iron Battle Axe");
        add(IFWItems.rusted_iron_war_hammer.get(), "Rusted Iron War Hammer");
        add(IFWItems.rusted_iron_dagger.get(), "Rusted Iron Dagger");
        add(IFWItems.iron_pickaxe.get(), "Iron Pickaxe");
        add(IFWItems.iron_shears.get(), "Iron Shears");
        add(IFWItems.iron_shovel.get(), "Iron Shovel");
        add(IFWItems.iron_hoe.get(), "Iron Hoe");
        add(IFWItems.iron_sword.get(), "Iron Sword");
        add(IFWItems.iron_axe.get(), "Iron Axe");
        add(IFWItems.iron_scythe.get(), "Iron Scythe");
        add(IFWItems.iron_mattock.get(), "Iron Mattock");
        add(IFWItems.iron_battle_axe.get(), "Iron Battle Axe");
        add(IFWItems.iron_war_hammer.get(), "Iron War Hammer");
        add(IFWItems.iron_dagger.get(), "Iron Dagger");
        add(IFWItems.golden_pickaxe.get(), "Gold Pickaxe");
        add(IFWItems.golden_shears.get(), "Gold Shears");
        add(IFWItems.golden_shovel.get(), "Gold Shovel");
        add(IFWItems.golden_hoe.get(), "Gold Hoe");
        add(IFWItems.golden_sword.get(), "Gold Sword");
        add(IFWItems.golden_axe.get(), "Gold Axe");
        add(IFWItems.golden_scythe.get(), "Gold Scythe");
        add(IFWItems.golden_mattock.get(), "Gold Mattock");
        add(IFWItems.golden_battle_axe.get(), "Gold Battle Axe");
        add(IFWItems.golden_war_hammer.get(), "Gold War Hammer");
        add(IFWItems.golden_dagger.get(), "Gold Dagger");
        add(IFWItems.flint_axe.get(), "Flint Axe");
        add(IFWItems.flint_knife.get(), "Flint Knife");
        add(IFWItems.flint_hatchet.get(), "Flint Hatchet");
        add(IFWItems.flint_shovel.get(), "Flint Shovel");
//        add(IFWItems.obsidian_axe.get(), "Obsidian Axe");
//        add(IFWItems.obsidian_knife.get(), "Obsidian Knife");
//        add(IFWItems.obsidian_hatchet.get(), "Obsidian Hatchet");
//        add(IFWItems.obsidian_shovel.get(), "Obsidian Shovel");
        add(IFWItems.wooden_club.get(), "Wooden Cudgel");
        add(IFWItems.wooden_shovel.get(), "Wooden Shovel");
        add(IFWItems.adamantium_helmet.get(), "Adamantium Helmet");
        add(IFWItems.adamantium_chestplate.get(), "Adamantium Chestplate");
        add(IFWItems.adamantium_leggings.get(), "Adamantium Leggings");
        add(IFWItems.adamantium_boots.get(), "Adamantium Boots");
        add(IFWItems.adamantium_chainmail_helmet.get(), "Adamantium Chainmail Helmet");
        add(IFWItems.adamantium_chainmail_chestplate.get(), "Adamantium Chainmail Chestplate");
        add(IFWItems.adamantium_chainmail_leggings.get(), "Adamantium Chainmail Leggings");
        add(IFWItems.adamantium_chainmail_boots.get(), "Adamantium Chainmail Boots");
        add(IFWItems.mithril_helmet.get(), "Mithril Helmet");
        add(IFWItems.mithril_chestplate.get(), "Mithril Chestplate");
        add(IFWItems.mithril_leggings.get(), "Mithril Leggings");
        add(IFWItems.mithril_boots.get(), "Mithril Boots");
        add(IFWItems.mithril_chainmail_helmet.get(), "Mithril Chainmail Helmet");
        add(IFWItems.mithril_chainmail_chestplate.get(), "Mithril Chainmail Chestplate");
        add(IFWItems.mithril_chainmail_leggings.get(), "Mithril Chainmail Leggings");
        add(IFWItems.mithril_chainmail_boots.get(), "Mithril Chainmail Boots");
        add(IFWItems.ancient_metal_helmet.get(), "Ancient Metal Helmet");
        add(IFWItems.ancient_metal_chestplate.get(), "Ancient Metal Chestplate");
        add(IFWItems.ancient_metal_leggings.get(), "Ancient Metal Leggings");
        add(IFWItems.ancient_metal_boots.get(), "Ancient Metal Boots");
        add(IFWItems.ancient_metal_chainmail_helmet.get(), "Ancient Metal Chainmail Helmet");
        add(IFWItems.ancient_metal_chainmail_chestplate.get(), "Ancient Metal Chainmail Chestplate");
        add(IFWItems.ancient_metal_chainmail_leggings.get(), "Ancient Metal Chainmail Leggings");
        add(IFWItems.ancient_metal_chainmail_boots.get(), "Ancient Metal Chainmail Boots");
        add(IFWItems.silver_helmet.get(), "Silver Helmet");
        add(IFWItems.silver_chestplate.get(), "Silver Chestplate");
        add(IFWItems.silver_leggings.get(), "Silver Leggings");
        add(IFWItems.silver_boots.get(), "Silver Boots");
        add(IFWItems.silver_chainmail_helmet.get(), "Silver Chainmail Helmet");
        add(IFWItems.silver_chainmail_chestplate.get(), "Silver Chainmail Chestplate");
        add(IFWItems.silver_chainmail_leggings.get(), "Silver Chainmail Leggings");
        add(IFWItems.silver_chainmail_boots.get(), "Silver Chainmail Boots");
        add(IFWItems.copper_helmet.get(), "Copper Helmet");
        add(IFWItems.copper_chestplate.get(), "Copper Chestplate");
        add(IFWItems.copper_leggings.get(), "Copper Leggings");
        add(IFWItems.copper_boots.get(), "Copper Boots");
        add(IFWItems.copper_chainmail_helmet.get(), "Copper Chainmail Helmet");
        add(IFWItems.copper_chainmail_chestplate.get(), "Copper Chainmail Chestplate");
        add(IFWItems.copper_chainmail_leggings.get(), "Copper Chainmail Leggings");
        add(IFWItems.copper_chainmail_boots.get(), "Copper Chainmail Boots");
        add(IFWItems.rusted_iron_helmet.get(), "Rusted Iron Helmet");
        add(IFWItems.rusted_iron_chestplate.get(), "Rusted Iron Chestplate");
        add(IFWItems.rusted_iron_leggings.get(), "Rusted Iron Leggings");
        add(IFWItems.rusted_iron_boots.get(), "Rusted Iron Boots");
        add(IFWItems.rusted_iron_chainmail_helmet.get(), "Rusted Iron Chainmail Helmet");
        add(IFWItems.rusted_iron_chainmail_chestplate.get(), "Rusted Iron Chainmail Chestplate");
        add(IFWItems.rusted_iron_chainmail_leggings.get(), "Rusted Iron Chainmail Leggings");
        add(IFWItems.rusted_iron_chainmail_boots.get(), "Rusted Iron Chainmail Boots");
        add(IFWItems.iron_helmet.get(), "Iron Helmet");
        add(IFWItems.iron_chestplate.get(), "Iron Chestplate");
        add(IFWItems.iron_leggings.get(), "Iron Leggings");
        add(IFWItems.iron_boots.get(), "Iron Boots");
        add(IFWItems.iron_chainmail_helmet.get(), "Iron Chainmail Helmet");
        add(IFWItems.iron_chainmail_chestplate.get(), "Iron Chainmail Chestplate");
        add(IFWItems.iron_chainmail_leggings.get(), "Iron Chainmail Leggings");
        add(IFWItems.iron_chainmail_boots.get(), "Iron Chainmail Boots");
        add(IFWItems.golden_helmet.get(), "Gold Helmet");
        add(IFWItems.golden_chestplate.get(), "Gold Chestplate");
        add(IFWItems.golden_leggings.get(), "Gold Leggings");
        add(IFWItems.golden_boots.get(), "Gold Boots");
        add(IFWItems.golden_chainmail_helmet.get(), "Gold Chainmail Helmet");
        add(IFWItems.golden_chainmail_chestplate.get(), "Gold Chainmail Chestplate");
        add(IFWItems.golden_chainmail_leggings.get(), "Gold Chainmail Leggings");
        add(IFWItems.golden_chainmail_boots.get(), "Gold Chainmail Boots");
    }
}
