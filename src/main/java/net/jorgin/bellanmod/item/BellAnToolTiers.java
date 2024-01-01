package net.jorgin.bellanmod.item;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.util.BellAnTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class BellAnToolTiers {
    public static final Tier MATRIX_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(4,1500,5f,4f, 25,
                    BellAnTags.Blocks.NEEDS_MATRIX_GOLD_TOOL, () -> Ingredient.of(BellAnItems.Matrix_Gold.get())),
            new ResourceLocation(BellAnMod.MOD_ID, "matrix_gold"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
