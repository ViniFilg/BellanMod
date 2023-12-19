package net.jorgin.bellanmod.datagen;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.block.BellAnBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


// gerador do json tags de blocos
public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BellAnMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // exemplos de como adicionar tags abaixo
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BellAnBlocks.LIMBO_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BellAnBlocks.LIMBO_BLOCK.get());

    }
}
