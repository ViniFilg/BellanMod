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

        simpleItem(BellAnItems.Goggles);
        simpleItem(BellAnItems.Limbo_Essence);
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
