package og.hlft.fabricatech;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.util.Identifier;
import og.hlft.fabricatech.datagen.DataInfoWrapper;

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
            biConsumer.accept(DataInfoWrappers.RAW_TIN_BLOCK.getId(), DataInfoWrappers.RAW_TIN_BLOCK.getBuild());
            biConsumer.accept(DataInfoWrappers.RAW_NICKEL_BLOCK.getId(), DataInfoWrappers.RAW_NICKEL_BLOCK.getBuild());
            biConsumer.accept(DataInfoWrappers.RAW_LEAD_BLOCK.getId(), DataInfoWrappers.RAW_LEAD_BLOCK.getBuild());
            biConsumer.accept(DataInfoWrappers.RAW_SILVER_BLOCK.getId(), DataInfoWrappers.RAW_SILVER_BLOCK.getBuild());
        }
    }

    public static class DataInfoWrappers {
        public static final DataInfoWrapper RAW_TIN_BLOCK = new DataInfoWrapper("raw_tin_block");
        public static final DataInfoWrapper RAW_NICKEL_BLOCK = new DataInfoWrapper("raw_nickel_block");
        public static final DataInfoWrapper RAW_LEAD_BLOCK = new DataInfoWrapper("raw_lead_block");
        public static final DataInfoWrapper RAW_SILVER_BLOCK = new DataInfoWrapper("raw_silver_block");
    }
}
