package og.hlft.fabricatech;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import og.hlft.fabricatech.init.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fabricatech implements ModInitializer, ClientModInitializer {
    public static final String MOD_ID = "fabricatech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemRegistry.register();

        LOGGER.info("Fabricatech setup done!");
    }

    @Override
    public void onInitializeClient() {

        LOGGER.info("Fabricatech client setup done!");
    }

    public static Identifier asId(String path) {
        return new Identifier(MOD_ID, path);
    }
}
