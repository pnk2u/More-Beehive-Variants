package de.pnku.mbhv.datagen;

import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import org.apache.commons.text.WordUtils;

import java.util.concurrent.CompletableFuture;

import static de.pnku.mbhv.init.MbhvBlockInit.more_beehives;

public class MoreBeehiveVariantLootTableGenerator extends FabricBlockLootTableProvider {
    public MoreBeehiveVariantLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block beehiveBlock : more_beehives) {
            dropWhenSilkTouch(beehiveBlock);
        }
    }
}
