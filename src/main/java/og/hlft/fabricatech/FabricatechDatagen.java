package og.hlft.fabricatech;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import og.hlft.fabricatech.datagen.RBlockLootProvider;
import og.hlft.fabricatech.datagen.RModelProvider;
import og.hlft.fabricatech.datagen.RI18NPProvider;

import static og.hlft.fabricatech.Fabricatech.LOGGER;

public class FabricatechDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.addProvider(RModelProvider::new);
        generator.addProvider(RBlockLootProvider::new);
        generator.addProvider(RI18NPProvider.EnUs::new);

        LOGGER.info("Fabricatech dataGen done!");
    }
}
