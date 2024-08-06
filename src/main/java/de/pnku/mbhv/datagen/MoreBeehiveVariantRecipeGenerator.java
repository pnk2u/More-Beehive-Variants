package de.pnku.mbhv.datagen;

import de.pnku.mbhv.MoreBeehiveVariants;
import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import static de.pnku.mbhv.init.MbhvBlockInit.more_beehives;

public class MoreBeehiveVariantRecipeGenerator extends FabricRecipeProvider {
    public MoreBeehiveVariantRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        for (Block beehiveBlock : more_beehives) {
            String planksWood = ((MoreBeehiveVariantBlock) beehiveBlock).beehiveWoodType;
            Item beehivePlanks = ((MoreBeehiveVariantBlock) beehiveBlock).getPlanksItem(planksWood);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, beehivePlanks.asItem())
                    .unlockedBy("has_planks", has(beehivePlanks))
                    .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
                    .pattern("PPP")
                    .pattern("HHH")
                    .pattern("PPP")
                    .define('P', beehivePlanks)
                    .define('H', Items.HONEYCOMB)
                    .save(recipeOutput, MoreBeehiveVariants.asId(planksWood + "_beehive"));
        }
    }
}
