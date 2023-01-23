package og.hlft.fabricatech;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.util.Identifier;
import og.hlft.fabricatech.api.datagen.DatagenUtil;

import java.util.function.BiConsumer;

public class FabricatechDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

    }

    private class BlockLoot extends SimpleFabricLootTableProvider {

        public BlockLoot(FabricDataGenerator dataGenerator, LootContextType lootContextType) {
            super(dataGenerator, lootContextType);
        }

        @Override
        public void accept(BiConsumer<Identifier, LootTable.Builder> biConsumer) {
            biConsumer.accept(DatagenUtils.RAW_TIN_BLOCK.getId(), DatagenUtils.RAW_TIN_BLOCK.getBuild());
            biConsumer.accept(DatagenUtils.RAW_NICKEL_BLOCK.getId(), DatagenUtils.RAW_NICKEL_BLOCK.getBuild());
            biConsumer.accept(DatagenUtils.RAW_LEAD_BLOCK.getId(), DatagenUtils.RAW_LEAD_BLOCK.getBuild());
            biConsumer.accept(DatagenUtils.RAW_SILVER_BLOCK.getId(), DatagenUtils.RAW_SILVER_BLOCK.getBuild());
        }
    }

    public class DatagenUtils {
        public static final DatagenUtil RAW_TIN_BLOCK = new DatagenUtil("raw_tin_block");
        public static final DatagenUtil RAW_NICKEL_BLOCK = new DatagenUtil("raw_nickel_block");
        public static final DatagenUtil RAW_LEAD_BLOCK = new DatagenUtil("raw_lead_block");
        public static final DatagenUtil RAW_SILVER_BLOCK = new DatagenUtil("raw_silver_block");
    }
}
