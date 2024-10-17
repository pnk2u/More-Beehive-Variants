package de.pnku.mbhv;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import de.pnku.mbhv.datagen.*;

public class MoreBeehiveVariantsDatagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        //pack.addProvider(MoreBeehiveVariantRecipeGenerator::new);
        //pack.addProvider(MoreBeehiveVariantBlockStateGenerator::new);
        //pack.addProvider(MoreBeehiveVariantLootTableGenerator::new);
        //pack.addProvider(MoreBeehiveVariantLangGenerator::new);
    }
}
