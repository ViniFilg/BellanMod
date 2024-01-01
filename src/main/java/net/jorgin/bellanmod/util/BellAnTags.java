package net.jorgin.bellanmod.util;

import net.jorgin.bellanmod.BellAnMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BellAnTags {
    // tags para blocos
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MATRIX_GOLD_TOOL = tag("needs_matrix_gold_tool");




        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(BellAnMod.MOD_ID, name));
        }

    }
    // tags para itens
    public static  class Items {



        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(BellAnMod.MOD_ID, name));
        }
    }
}
