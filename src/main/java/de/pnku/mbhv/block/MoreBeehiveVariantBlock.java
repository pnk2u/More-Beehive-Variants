package de.pnku.mbhv.block;

import de.pnku.mbhv.MoreBeehiveVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
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
}