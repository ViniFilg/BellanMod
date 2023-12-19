package net.jorgin.bellanmod.datagen.loot;

import net.jorgin.bellanmod.block.BellAnBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        /*
        dropSelf eh um metodo para o bloco dropar a si mesmo quando quebrados
        codigo para blocos que não dropam a si mesmos esta abaixo
        this.add(BellAnBlocks.nome_bloco.get(),
                block -> createOreDrops(BellAnBlocks.nome_bloco.get(), BellAnItems.nome_item_dropado.get());
        */
        this.dropSelf(BellAnBlocks.LIMBO_BLOCK.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BellAnBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
