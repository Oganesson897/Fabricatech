package og.hlft.fabricatech;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import og.hlft.fabricatech.datagen.*;

import static og.hlft.fabricatech.Fabricatech.LOGGER;

public class FabricatechDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.addProvider(RModelProvider::new);
        generator.addProvider(RBlockLootProvider::new);
        generator.addProvider(LangENUSProvider::new);
        generator.addProvider(LangZHCNProvider::new);
        generator.addProvider(RTagProvider::new);

        LOGGER.info("Fabricatech dataGen done!");
    }
}
