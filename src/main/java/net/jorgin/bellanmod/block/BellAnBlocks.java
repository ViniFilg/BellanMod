package net.jorgin.bellanmod.block;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.item.BellAnItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BellAnBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BellAnMod.MOD_ID);


    public static final RegistryObject<Block> LIMBO_BLOCK = registerBlock("limbo_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)));
    public static final RegistryObject<Block> BRASADIL_ORE = registerBlock("brasadil_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> AQUAREL_ORE = registerBlock("aquarel_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> MATRIX_GOLD_ORE = registerBlock("matrix_gold_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));




    //metodos que auxiliam a adicionar blocos
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return BellAnItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
