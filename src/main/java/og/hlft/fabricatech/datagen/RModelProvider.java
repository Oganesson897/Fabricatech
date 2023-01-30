package og.hlft.fabricatech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.init.RMaterials;

public class RModelProvider extends FabricModelProvider {
    private static BlockStateModelGenerator blockGenerator;
    private static ItemModelGenerator itemGenerator;
    public RModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        blockGenerator = generator;

        genMaterialBlockState(RMaterials.TIN);
        genMaterialBlockState(RMaterials.LEAD);
        genMaterialBlockState(RMaterials.NICKEL);
        genMaterialBlockState(RMaterials.SILVER);

        genMaterialBlockState(RMaterials.IRON);
        genMaterialBlockState(RMaterials.GOLD);
        genMaterialBlockState(RMaterials.COPPER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        itemGenerator = generator;

        genMaterialModel(RMaterials.TIN);
        genMaterialModel(RMaterials.LEAD);
        genMaterialModel(RMaterials.NICKEL);
        genMaterialModel(RMaterials.SILVER);

        genMaterialModel(RMaterials.IRON);
        genMaterialModel(RMaterials.GOLD);
        genMaterialModel(RMaterials.COPPER);
    }

    protected static void genMaterialModel(RMaterial material) {
        for (RMaterialPart part : material.getItemParts()) {
            itemGenerator.register(material.getPartItem(part), Models.GENERATED);
        }
    }

    protected static void genMaterialBlockState(RMaterial material) {
        for (RMaterialPart part: material.getBlockParts()) {
            blockGenerator.registerCubeAllModelTexturePool(material.getPartBlock(part));
        }
    }
}
