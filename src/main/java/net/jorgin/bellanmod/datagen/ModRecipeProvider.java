package net.jorgin.bellanmod.datagen;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.block.BellAnBlocks;
import net.jorgin.bellanmod.item.BellAnItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.data.ForgeItemTagsProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> BRASADIL_SMELTABLES = List.of(BellAnItems.Brasadil.get(),
            BellAnBlocks.BRASADIL_ORE.get(),BellAnBlocks.LIMBO_BLOCK.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BellAnBlocks.LIMBO_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', BellAnItems.Limbo_Essence.get())
                .unlockedBy(getHasName(BellAnItems.Limbo_Essence.get()), has(BellAnItems.Limbo_Essence.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BellAnItems.Limbo_Essence.get(),9)
                .requires(BellAnBlocks.LIMBO_BLOCK.get())
                .unlockedBy(getHasName(BellAnBlocks.LIMBO_BLOCK.get()), has(BellAnBlocks.LIMBO_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BellAnItems.Brasell.get())
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .define('#', Items.IRON_NUGGET)
                .define('$', BellAnItems.Brasadil.get())
                .unlockedBy(getHasName(BellAnItems.Brasadil.get()), has(BellAnItems.Brasadil.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BellAnItems.Matrix_Gold_Sword.get())
                .pattern(" $ ")
                .pattern(" $ ")
                .pattern(" # ")
                .define('#', Items.STICK)
                .define('$', BellAnItems.Matrix_Gold.get())
                .unlockedBy(getHasName(BellAnItems.Matrix_Gold.get()), has(BellAnItems.Matrix_Gold.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BellAnItems.Matrix_Gold_Pickaxe.get())
                .pattern("$$$")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.STICK)
                .define('$', BellAnItems.Matrix_Gold.get())
                .unlockedBy(getHasName(BellAnItems.Matrix_Gold.get()), has(BellAnItems.Matrix_Gold.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BellAnItems.Matrix_Gold_Axe.get())
                .pattern(" $$")
                .pattern(" #$")
                .pattern(" # ")
                .define('#', Items.STICK)
                .define('$', BellAnItems.Matrix_Gold.get())
                .unlockedBy(getHasName(BellAnItems.Matrix_Gold.get()), has(BellAnItems.Matrix_Gold.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BellAnItems.Matrix_Gold_Shovel.get())
                .pattern(" $ ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.STICK)
                .define('$', BellAnItems.Matrix_Gold.get())
                .unlockedBy(getHasName(BellAnItems.Matrix_Gold.get()), has(BellAnItems.Matrix_Gold.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BellAnItems.Matrix_Gold_Hoe.get())
                .pattern(" $$")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.STICK)
                .define('$', BellAnItems.Matrix_Gold.get())
                .unlockedBy(getHasName(BellAnItems.Matrix_Gold.get()), has(BellAnItems.Matrix_Gold.get()))
                .save(pWriter);



    }


    // metodos de adicionar o json de recipes
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, BellAnMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
