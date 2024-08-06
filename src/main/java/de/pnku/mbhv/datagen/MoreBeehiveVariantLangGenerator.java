package de.pnku.mbhv.datagen;

import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.world.level.block.Block;
import org.apache.commons.text.WordUtils;

import static de.pnku.mbhv.init.MbhvBlockInit.more_beehives;

public class MoreBeehiveVariantLangGenerator extends FabricLanguageProvider{
    public MoreBeehiveVariantLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        for (Block beehiveBlock : more_beehives) {
            String beehiveName = WordUtils.capitalizeFully(((MoreBeehiveVariantBlock) beehiveBlock).beehiveWoodType + " Beehive");
            translationBuilder.add(beehiveBlock, beehiveName);
        }
    }
}
