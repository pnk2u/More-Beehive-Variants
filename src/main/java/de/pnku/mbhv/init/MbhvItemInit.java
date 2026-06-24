package de.pnku.mbhv.init;

import de.pnku.mbhv.MoreBeehiveVariants;
import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;

import java.util.List;

public class MbhvItemInit {
    static final Item.Properties beehiveProperties = new Item.Properties().component(DataComponents.BEES, List.of());
    public static final Item BIRCH_BEEHIVE_I = new BlockItem(MbhvBlockInit.BIRCH_BEEHIVE, beehiveProperties);
    public static final Item DARK_OAK_BEEHIVE_I = new BlockItem(MbhvBlockInit.DARK_OAK_BEEHIVE, beehiveProperties);
    public static final Item SPRUCE_BEEHIVE_I = new BlockItem(MbhvBlockInit.SPRUCE_BEEHIVE, beehiveProperties);
    public static final Item JUNGLE_BEEHIVE_I = new BlockItem(MbhvBlockInit.JUNGLE_BEEHIVE, beehiveProperties);
    public static final Item ACACIA_BEEHIVE_I = new BlockItem(MbhvBlockInit.ACACIA_BEEHIVE, beehiveProperties);
    public static final Item MANGROVE_BEEHIVE_I = new BlockItem(MbhvBlockInit.MANGROVE_BEEHIVE, beehiveProperties);
    public static final Item CHERRY_BEEHIVE_I = new BlockItem(MbhvBlockInit.CHERRY_BEEHIVE, beehiveProperties);
    public static final Item BAMBOO_BEEHIVE_I = new BlockItem(MbhvBlockInit.BAMBOO_BEEHIVE, beehiveProperties);
    public static final Item CRIMSON_BEEHIVE_I = new BlockItem(MbhvBlockInit.CRIMSON_BEEHIVE, beehiveProperties);
    public static final Item WARPED_BEEHIVE_I = new BlockItem(MbhvBlockInit.WARPED_BEEHIVE, beehiveProperties);


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

    private static void registerBeehiveItem(Item beehive, Item beehiveAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreBeehiveVariants.asId(((MoreBeehiveVariantBlock) ((BlockItem) beehive).getBlock()).beehiveWoodType + "_beehive"), beehive);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(beehiveAfter, beehive));
    }
}