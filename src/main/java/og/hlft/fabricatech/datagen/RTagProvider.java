package og.hlft.fabricatech.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.init.RMaterials;

public class RTagProvider extends FabricTagProvider.BlockTagProvider {
    private static FabricTagBuilder pickaxeBuilder;

    public RTagProvider(FabricDataOutput dataGenerator,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataGenerator, registriesFuture);
    }

    @Override
    protected void configure(WrapperLookup arg) {
        pickaxeBuilder = getOrCreateTagBuilder(
                TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft", "mineable/pickaxe")));

        materialBlock(RMaterials.TIN);
        materialBlock(RMaterials.NICKEL);
        materialBlock(RMaterials.LEAD);
        materialBlock(RMaterials.SILVER);
    }

    protected void materialBlock(RMaterial material) {
        for (RMaterialPart part : material.getBlockParts()) {
            pickaxeBuilder.add(material.getPartBlock(part));
        }
    }
}
