package net.jorgin.bellanmod.datagen;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.block.BellAnBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BellAnMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(BellAnBlocks.LIMBO_BLOCK);
        blockWithItem(BellAnBlocks.BRASADIL_ORE);
        blockWithItem(BellAnBlocks.AQUAREL_ORE);
        blockWithItem(BellAnBlocks.MATRIX_GOLD_ORE);


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

