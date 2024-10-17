package de.pnku.mbhv.block;

import de.pnku.mbhv.MoreBeehiveVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreBeehiveVariantBlock extends BeehiveBlock {
    public final String beehiveWoodType;

    public MoreBeehiveVariantBlock(MapColor colour, String beehiveWoodType) {
        super(Properties.ofFullCopy(Blocks.BEEHIVE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreBeehiveVariants.asId(beehiveWoodType + "_beehive"))));
        this.beehiveWoodType = beehiveWoodType;
    }

    public MoreBeehiveVariantBlock(MapColor colour, SoundType sound, String beehiveWoodType) {
        super(Properties.ofFullCopy(Blocks.BEEHIVE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreBeehiveVariants.asId(beehiveWoodType + "_beehive"))).sound(sound));
        this.beehiveWoodType = beehiveWoodType;
    }

    public Item getPlanksItem(String planksWood) {
        switch (planksWood) {
            case "acacia" -> {
                return Items.ACACIA_PLANKS;
            }
            case "bamboo" -> {
                return Items.BAMBOO_PLANKS;
            }
            case "birch" -> {
                return Items.BIRCH_PLANKS;
            }
            case "cherry" -> {
                return Items.CHERRY_PLANKS;
            }
            case "crimson" -> {
                return Items.CRIMSON_PLANKS;
            }
            case "dark_oak" -> {
                return Items.DARK_OAK_PLANKS;
            }
            case "jungle" -> {
                return Items.JUNGLE_PLANKS;
            }
            case "mangrove" -> {
                return Items.MANGROVE_PLANKS;
            }
            case "spruce" -> {
                return Items.SPRUCE_PLANKS;
            }
            case "warped" -> {
                return Items.WARPED_PLANKS;
            }

        }
        return null;
    }
}