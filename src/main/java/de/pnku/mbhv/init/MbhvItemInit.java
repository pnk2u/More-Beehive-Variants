package de.pnku.mbhv.init;

import de.pnku.mbhv.MoreBeehiveVariants;
import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;
import net.minecraft.world.item.component.Bees;
import net.minecraft.world.item.component.BlockItemStateProperties;
import net.minecraft.world.level.block.BeehiveBlock;

import static de.pnku.mbhv.init.MbhvBlockInit.*;

public class MbhvItemInit {
    public static final Item BIRCH_BEEHIVE_I = itemFromBlock(BIRCH_BEEHIVE);
    public static final Item DARK_OAK_BEEHIVE_I = itemFromBlock(DARK_OAK_BEEHIVE);
    public static final Item PALE_OAK_BEEHIVE_I = itemFromBlock(PALE_OAK_BEEHIVE);
    public static final Item SPRUCE_BEEHIVE_I = itemFromBlock(SPRUCE_BEEHIVE);
    public static final Item JUNGLE_BEEHIVE_I = itemFromBlock(JUNGLE_BEEHIVE);
    public static final Item ACACIA_BEEHIVE_I = itemFromBlock(ACACIA_BEEHIVE);
    public static final Item MANGROVE_BEEHIVE_I = itemFromBlock(MANGROVE_BEEHIVE);
    public static final Item CHERRY_BEEHIVE_I = itemFromBlock(CHERRY_BEEHIVE);
    public static final Item BAMBOO_BEEHIVE_I = itemFromBlock(BAMBOO_BEEHIVE);
    public static final Item CRIMSON_BEEHIVE_I = itemFromBlock(CRIMSON_BEEHIVE, true);
    public static final Item WARPED_BEEHIVE_I = itemFromBlock(WARPED_BEEHIVE, true);

    public static BlockItem itemFromBlock(MoreBeehiveVariantBlock moreBeehiveVariantBlock) {
        return new BlockItem(moreBeehiveVariantBlock, setProperties(moreBeehiveVariantBlock, false));
    }

    public static BlockItem itemFromBlock(MoreBeehiveVariantBlock moreBeehiveVariantBlock, boolean isNether) {
        return new BlockItem(moreBeehiveVariantBlock, setProperties(moreBeehiveVariantBlock, isNether));
    }

    public static Item.Properties setProperties(MoreBeehiveVariantBlock moreBeehiveVariantBlock, boolean isNether) {
        Item.Properties properties = new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreBeehiveVariantBlock)))
                .component(DataComponents.BEES, Bees.EMPTY).component(DataComponents.BLOCK_STATE, BlockItemStateProperties.EMPTY.with(BeehiveBlock.HONEY_LEVEL, 0)).useBlockDescriptionPrefix();
        return isNether ? properties.fireResistant() : properties;
    }

    public static void registerBeehiveItems() {
        registerBeehiveItem(BIRCH_BEEHIVE_I, Items.BEEHIVE);
        registerBeehiveItem(DARK_OAK_BEEHIVE_I, BIRCH_BEEHIVE_I);
        registerBeehiveItem(PALE_OAK_BEEHIVE_I, DARK_OAK_BEEHIVE_I);
        registerBeehiveItem(SPRUCE_BEEHIVE_I, PALE_OAK_BEEHIVE_I);
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

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.insertAfter(beehiveAfter, beehive));
    }
}