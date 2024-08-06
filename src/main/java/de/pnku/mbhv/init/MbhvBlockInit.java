package de.pnku.mbhv.init;

import de.pnku.mbhv.MoreBeehiveVariants;
import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class MbhvBlockInit {
    public static final MoreBeehiveVariantBlock BIRCH_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.SAND, "birch");
    public static final MoreBeehiveVariantBlock DARK_OAK_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final MoreBeehiveVariantBlock SPRUCE_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.PODZOL, "spruce");
    public static final MoreBeehiveVariantBlock JUNGLE_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.DIRT, "jungle");
    public static final MoreBeehiveVariantBlock ACACIA_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final MoreBeehiveVariantBlock MANGROVE_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.COLOR_RED, "mangrove");
    public static final MoreBeehiveVariantBlock CHERRY_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final MoreBeehiveVariantBlock BAMBOO_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final MoreBeehiveVariantBlock CRIMSON_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final MoreBeehiveVariantBlock WARPED_BEEHIVE = new MoreBeehiveVariantBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static final List<Block> more_beehives = new ArrayList<>();


    public static void registerBeehiveBlocks() {
        registerBeehiveBlock(BIRCH_BEEHIVE);
        registerBeehiveBlock(DARK_OAK_BEEHIVE);
        registerBeehiveBlock(SPRUCE_BEEHIVE);
        registerBeehiveBlock(JUNGLE_BEEHIVE);
        registerBeehiveBlock(ACACIA_BEEHIVE);
        registerBeehiveBlock(MANGROVE_BEEHIVE);
        registerBeehiveBlock(CHERRY_BEEHIVE);
        registerBeehiveBlock(BAMBOO_BEEHIVE);
        registerBeehiveBlock(CRIMSON_BEEHIVE);
        registerBeehiveBlock(WARPED_BEEHIVE);

    }

    private static void registerBeehiveBlock(MoreBeehiveVariantBlock beehive) {
        Registry.register(BuiltInRegistries.BLOCK, MoreBeehiveVariants.asId(beehive.beehiveWoodType + "_beehive"), beehive);
        more_beehives.add(beehive);
    }
}
