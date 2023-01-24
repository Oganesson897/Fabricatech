package og.hlft.fabricatech;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import og.hlft.fabricatech.datagen.LangENUSProvider;
import og.hlft.fabricatech.datagen.LangZHCNProvider;
import og.hlft.fabricatech.datagen.RBlockLootProvider;
import og.hlft.fabricatech.datagen.RModelProvider;

import static og.hlft.fabricatech.Fabricatech.LOGGER;

public class FabricatechDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.addProvider(RModelProvider::new);
        generator.addProvider(RBlockLootProvider::new);
        generator.addProvider(LangENUSProvider::new);
        generator.addProvider(LangZHCNProvider::new);

        LOGGER.info("Fabricatech dataGen done!");
    }
}
