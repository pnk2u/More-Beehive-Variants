package de.pnku.mbhv.init;

import de.pnku.mbhv.MoreBeehiveVariants;
import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;

public class MbhvItemInit {
    public static final BlockItem BIRCH_BEEHIVE_I = new BlockItem(MbhvBlockInit.BIRCH_BEEHIVE, new Item.Properties());
    public static final BlockItem DARK_OAK_BEEHIVE_I = new BlockItem(MbhvBlockInit.DARK_OAK_BEEHIVE, new Item.Properties());
    public static final BlockItem SPRUCE_BEEHIVE_I = new BlockItem(MbhvBlockInit.SPRUCE_BEEHIVE, new Item.Properties());
    public static final BlockItem JUNGLE_BEEHIVE_I = new BlockItem(MbhvBlockInit.JUNGLE_BEEHIVE, new Item.Properties());
    public static final BlockItem ACACIA_BEEHIVE_I = new BlockItem(MbhvBlockInit.ACACIA_BEEHIVE, new Item.Properties());
    public static final BlockItem MANGROVE_BEEHIVE_I = new BlockItem(MbhvBlockInit.MANGROVE_BEEHIVE, new Item.Properties());
    public static final BlockItem CHERRY_BEEHIVE_I = new BlockItem(MbhvBlockInit.CHERRY_BEEHIVE, new Item.Properties());
    public static final BlockItem BAMBOO_BEEHIVE_I = new BlockItem(MbhvBlockInit.BAMBOO_BEEHIVE, new Item.Properties());
    public static final BlockItem CRIMSON_BEEHIVE_I = new BlockItem(MbhvBlockInit.CRIMSON_BEEHIVE, new Item.Properties());
    public static final BlockItem WARPED_BEEHIVE_I = new BlockItem(MbhvBlockInit.WARPED_BEEHIVE, new Item.Properties());


    public static void registerBeehiveItems() {
        registerBeehiveItem(BIRCH_BEEHIVE_I, Items.BEEHIVE);
        registerBeehiveItem(DARK_OAK_BEEHIVE_I, BIRCH_BEEHIVE_I);
        registerBeehiveItem(SPRUCE_BEEHIVE_I, DARK_OAK_BEEHIVE_I);
        registerBeehiveItem(JUNGLE_BEEHIVE_I, SPRUCE_BEEHIVE_I);
        registerBeehiveItem(ACACIA_BEEHIVE_I, JUNGLE_BEEHIVE_I);
        registerBeehiveItem(MANGROVE_BEEHIVE_I, ACACIA_BEEHIVE_I);
        registerBeehiveItem(CHERRY_BEEHIVE_I, MANGROVE_BEEHIVE_I);
        registerBeehiveItem(BAMBOO_BEEHIVE_I, CHERRY_BEEHIVE_I);
        registerBeehiveItem(CRIMSON_BEEHIVE_I, BAMBOO_BEEHIVE_I);
        registerBeehiveItem(WARPED_BEEHIVE_I, CRIMSON_BEEHIVE_I);
    }

    private static void registerBeehiveItem(BlockItem beehive, Item beehiveAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreBeehiveVariants.asId(((MoreBeehiveVariantBlock) beehive.getBlock()).beehiveWoodType + "_beehive"), beehive);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(beehiveAfter, beehive));
    }
}