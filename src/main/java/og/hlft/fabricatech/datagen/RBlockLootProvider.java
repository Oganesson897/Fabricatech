package og.hlft.fabricatech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.common.materials.RMaterials;

import java.util.function.BiConsumer;

import static og.hlft.fabricatech.Fabricatech.asId;

public class RBlockLootProvider extends SimpleFabricLootTableProvider {
    private static BiConsumer<Identifier, LootTable.Builder> consumer;

    public RBlockLootProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> builderBiConsumer) {
        consumer = builderBiConsumer;

        lootMaterial(RMaterials.TIN);
        lootMaterial(RMaterials.LEAD);
        lootMaterial(RMaterials.NICKEL);
        lootMaterial(RMaterials.SILVER);
    }

    protected static void lootMaterial(RMaterial material) {
        for (RMaterialPart part : material.getBlockParts()) {
            if (part == RMaterialPart.ORE || part == RMaterialPart.DEEPSLATE_ORE)
                continue;
            consumer.accept(asId(material.makeRID(part)), BlockLootTableGenerator.drops(material.getPartBlock(part), material.getPartItem(part), ConstantLootNumberProvider.create(1.0F)));
        }
    }
}
