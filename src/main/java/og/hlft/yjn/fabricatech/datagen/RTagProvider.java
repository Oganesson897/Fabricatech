package og.hlft.yjn.fabricatech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import og.hlft.yjn.fabricatech.common.materials.RMaterial;
import og.hlft.yjn.fabricatech.common.materials.RMaterialPart;
import og.hlft.yjn.fabricatech.init.RMaterials;

public class RTagProvider extends FabricTagProvider<Block> {
    private static FabricTagBuilder<Block> pickaxeBuilder;

    public RTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK, "Fabricatech Block Tag");
    }

    @Override
    protected void generateTags() {
        pickaxeBuilder = getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft", "mineable/pickaxe")));

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
