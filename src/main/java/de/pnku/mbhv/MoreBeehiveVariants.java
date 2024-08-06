package de.pnku.mbhv;

import de.pnku.mbhv.init.MbhvBlockInit;
import de.pnku.mbhv.init.MbhvItemInit;
import de.pnku.mbhv.poi.MbhvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreBeehiveVariants implements ModInitializer {
    public static final String MODID = "quad-lolmbhv";

    @Override
    public void onInitialize() {
        MbhvBlockInit.registerBeehiveBlocks();
        MbhvItemInit.registerBeehiveItems();
        MbhvPointOfInterestTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}