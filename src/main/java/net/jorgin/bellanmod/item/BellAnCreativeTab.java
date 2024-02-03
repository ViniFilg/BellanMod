package net.jorgin.bellanmod.item;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.block.BellAnBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BellAnCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BellAnMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BELLAN_TAB = CREATIVE_MODE_TABS.register("bellum_anachronisms",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BellAnItems.Limbo_Essence.get()))
                    .title(Component.translatable("creativetab.bellum_anachronisms"))
                    .displayItems((pParameters, pOutput) -> {

                        // Para adicionar um item usar o comando abaixo
                        pOutput.accept(BellAnItems.Goggles.get());
                        pOutput.accept(BellAnItems.Limbo_Staff.get());
                        pOutput.accept(BellAnItems.Limbo_Essence.get());
                        pOutput.accept(BellAnItems.Vodka.get());
                        pOutput.accept(BellAnItems.Elektra_Dagger.get());

                        pOutput.accept(BellAnItems.Matrix_Gold_Sword.get());
                        pOutput.accept(BellAnItems.Matrix_Gold_Pickaxe.get());
                        pOutput.accept(BellAnItems.Matrix_Gold_Axe.get());
                        pOutput.accept(BellAnItems.Matrix_Gold_Shovel.get());
                        pOutput.accept(BellAnItems.Matrix_Gold_Hoe.get());


                        // minérios e metais
                        pOutput.accept(BellAnItems.Brasadil.get());
                        pOutput.accept(BellAnItems.Matrix_Gold.get());
                        pOutput.accept(BellAnItems.Aquarel.get());
                        pOutput.accept(BellAnItems.Brasell.get());
                        pOutput.accept(BellAnItems.Silver.get());
                        pOutput.accept(BellAnItems.Lead.get());
                        pOutput.accept(BellAnItems.Gear.get());
                        pOutput.accept(BellAnItems.Wrench.get());




                        pOutput.accept(BellAnBlocks.LIMBO_BLOCK.get());
                        pOutput.accept(BellAnBlocks.BRASADIL_ORE.get());
                        pOutput.accept(BellAnBlocks.AQUAREL_ORE.get());
                        pOutput.accept(BellAnBlocks.MATRIX_GOLD_ORE.get());
                        pOutput.accept(BellAnBlocks.SILVER_ORE.get());
                        pOutput.accept(BellAnBlocks.LEAD_ORE.get());
                        pOutput.accept(BellAnBlocks.LAVA_SMELTER.get());
                        pOutput.accept(BellAnItems.Bolinha_Spawn_Egg.get());
                        pOutput.accept(BellAnItems.PhantomMod_Spawn_Egg.get());




                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
