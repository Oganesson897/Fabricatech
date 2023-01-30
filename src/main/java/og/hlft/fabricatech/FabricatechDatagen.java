package og.hlft.fabricatech;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import og.hlft.fabricatech.datagen.*;

import static og.hlft.fabricatech.Fabricatech.LOGGER;

public class FabricatechDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        var pack = generator.createPack();

        pack.addProvider(RModelProvider::new);
        pack.addProvider(RBlockLootProvider::new);
        pack.addProvider(LangENUSProvider::new);
        pack.addProvider(LangZHCNProvider::new);
        pack.addProvider(RTagProvider::new);

        LOGGER.info("Fabricatech dataGen done!");
    }
}
