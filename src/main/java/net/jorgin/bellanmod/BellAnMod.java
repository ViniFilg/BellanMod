package net.jorgin.bellanmod;

import com.mojang.logging.LogUtils;
import net.jorgin.bellanmod.block.BellAnBlocks;
import net.jorgin.bellanmod.block.entity.BellAnBlockEntities;
import net.jorgin.bellanmod.entity.BellAnEntities;
import net.jorgin.bellanmod.entity.client.BolinhaRenderer;
import net.jorgin.bellanmod.entity.client.PhantomModRenderer;
import net.jorgin.bellanmod.item.BellAnCreativeTab;
import net.jorgin.bellanmod.item.BellAnItems;
import net.jorgin.bellanmod.recipe.BellAnRecipes;
import net.jorgin.bellanmod.screen.BellAnMenuTypes;
import net.jorgin.bellanmod.screen.LavaSmelterScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BellAnMod.MOD_ID)
public class BellAnMod {
    public static final String MOD_ID = "bellanmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BellAnMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //registrando elementos do mod
        BellAnCreativeTab.register(modEventBus);

        BellAnItems.register(modEventBus);
        BellAnBlocks.register(modEventBus);

        BellAnBlockEntities.register(modEventBus);
        BellAnMenuTypes.register(modEventBus);

        BellAnRecipes.register(modEventBus);
        BellAnEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        /* com a tab do mod, esse codigo n eh mais necessario

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(BellAnItems.Goggles);
            event.accept(BellAnItems.Limbo_Staff);
        }

        */
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(BellAnEntities.BOLINNHA.get(), BolinhaRenderer::new);
            EntityRenderers.register(BellAnEntities.PHANTOMMOD.get(), PhantomModRenderer::new);
            MenuScreens.register(BellAnMenuTypes.LAVA_SMELTER_MENU.get(), LavaSmelterScreen::new);
        }
    }
}
