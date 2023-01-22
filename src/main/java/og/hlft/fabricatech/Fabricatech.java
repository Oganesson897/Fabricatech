package og.hlft.fabricatech;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class Fabricatech implements ModInitializer, ClientModInitializer {
    @Override
    public void onInitialize() {

        Utils.LOGGER.info("Fabricatech setup done!");
    }

    @Override
    public void onInitializeClient() {

        Utils.LOGGER.info("Fabricatech client setup done!");
    }
}
