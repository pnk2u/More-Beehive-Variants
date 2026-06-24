package de.pnku.mbhv.block;

import de.pnku.mbhv.MoreBeehiveVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class MoreBeehiveVariantBlock extends BeehiveBlock {
    public final String beehiveWoodType;

    public MoreBeehiveVariantBlock(MapColor colour, String beehiveWoodType) {
        super(Properties.of().instrument(NoteBlockInstrument.BASS).strength(0.6F).sound(SoundType.WOOD).ignitedByLava().mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreBeehiveVariants.asId(beehiveWoodType + "_beehive"))));
        this.beehiveWoodType = beehiveWoodType;
    }

    public MoreBeehiveVariantBlock(MapColor colour, SoundType sound, String beehiveWoodType, Properties ignitability) {
        super(ignitability.instrument(NoteBlockInstrument.BASS).strength(0.6F).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreBeehiveVariants.asId(beehiveWoodType + "_beehive"))).sound(sound));
        this.beehiveWoodType = beehiveWoodType;
    }
}