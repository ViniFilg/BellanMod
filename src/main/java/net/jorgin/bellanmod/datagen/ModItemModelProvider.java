package net.jorgin.bellanmod.datagen;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.item.BellAnItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BellAnMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(BellAnItems.Elektra_Dagger);
        handheldItem(BellAnItems.Limbo_Staff);
        handheldItem(BellAnItems.Matrix_Gold_Sword);
        handheldItem(BellAnItems.Matrix_Gold_Pickaxe);
        handheldItem(BellAnItems.Matrix_Gold_Axe);
        handheldItem(BellAnItems.Matrix_Gold_Shovel);
        handheldItem(BellAnItems.Matrix_Gold_Hoe);


        simpleItem(BellAnItems.Goggles);
        simpleItem(BellAnItems.Limbo_Essence);
        simpleItem(BellAnItems.Brasadil);
        simpleItem(BellAnItems.Aquarel);
        simpleItem(BellAnItems.Matrix_Gold);
        simpleItem(BellAnItems.Brasell);
        simpleItem(BellAnItems.Silver);
        simpleItem(BellAnItems.Lead);
        withExistingParent(BellAnItems.Bolinha_Spawn_Egg.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(BellAnItems.PhantomMod_Spawn_Egg.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    // metodos da adicionar um json para modelos de items
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BellAnMod.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BellAnMod.MOD_ID, "item/" + item.getId().getPath()));

    }

}
