package de.pnku.mbhv.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.Block;

import static de.pnku.mbhv.init.MbhvBlockInit.more_beehives;

public class MoreBeehiveVariantLootTableGenerator extends FabricBlockLootTableProvider {
    public MoreBeehiveVariantLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (Block beehiveBlock : more_beehives) {
            dropWhenSilkTouch(beehiveBlock);
        }
    }
}
