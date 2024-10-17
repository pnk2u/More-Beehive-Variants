package de.pnku.mbhv.init;

import de.pnku.mbhv.MoreBeehiveVariants;
import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;

import static de.pnku.mbhv.init.MbhvBlockInit.*;

public class MbhvItemInit {
    public static final BlockItem BIRCH_BEEHIVE_I = itemFromBlock(BIRCH_BEEHIVE);
    public static final BlockItem DARK_OAK_BEEHIVE_I = itemFromBlock(DARK_OAK_BEEHIVE);
    public static final BlockItem SPRUCE_BEEHIVE_I = itemFromBlock(SPRUCE_BEEHIVE);
    public static final BlockItem JUNGLE_BEEHIVE_I = itemFromBlock(JUNGLE_BEEHIVE);
    public static final BlockItem ACACIA_BEEHIVE_I = itemFromBlock(ACACIA_BEEHIVE);
    public static final BlockItem MANGROVE_BEEHIVE_I = itemFromBlock(MANGROVE_BEEHIVE);
    public static final BlockItem CHERRY_BEEHIVE_I = itemFromBlock(CHERRY_BEEHIVE);
    public static final BlockItem BAMBOO_BEEHIVE_I = itemFromBlock(BAMBOO_BEEHIVE);
    public static final BlockItem CRIMSON_BEEHIVE_I = itemFromBlock(CRIMSON_BEEHIVE);
    public static final BlockItem WARPED_BEEHIVE_I = itemFromBlock(WARPED_BEEHIVE);

    public static BlockItem itemFromBlock(MoreBeehiveVariantBlock moreBeehiveVariantBlock) {
        return new BlockItem(moreBeehiveVariantBlock, setProperties(moreBeehiveVariantBlock));
    }

    public static Item.Properties setProperties(MoreBeehiveVariantBlock moreBeehiveVariantBlock) {
        return new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreBeehiveVariantBlock))).useBlockDescriptionPrefix();
    }

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