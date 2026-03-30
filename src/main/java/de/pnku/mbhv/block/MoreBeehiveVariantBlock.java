package de.pnku.mbhv.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreBeehiveVariantBlock extends BeehiveBlock {
    public final String beehiveWoodType;

    public MoreBeehiveVariantBlock(MapColor colour, String beehiveWoodType) {
        super(Properties.copy(Blocks.BEEHIVE).mapColor(colour));
        this.beehiveWoodType = beehiveWoodType;
    }

    public MoreBeehiveVariantBlock(MapColor colour, SoundType sound, String beehiveWoodType) {
        super(Properties.copy(Blocks.BEEHIVE).mapColor(colour).sound(sound));
        this.beehiveWoodType = beehiveWoodType;
    }
}