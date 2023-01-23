package og.hlft.fabricatech;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.init.BlockRegistry;
import og.hlft.fabricatech.init.ItemPredicateRegistry;
import og.hlft.fabricatech.init.ItemRegistry;
import og.hlft.fabricatech.init.VeinRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fabricatech implements ModInitializer, ClientModInitializer {
    public static final String MOD_ID = "fabricatech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static ItemGroup TAB = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "main"))
            .icon(() -> Registry.ITEM.get(asId("battery")).getDefaultStack()).build();

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        BlockRegistry.register();
        VeinRegistry.register();

        LOGGER.info("Fabricatech setup done!");
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void onInitializeClient() {
        ItemPredicateRegistry.register();

        LOGGER.info("Fabricatech client setup done!");
    }

    public static Identifier asId(String path) {
        return new Identifier(MOD_ID, path);
    }
}
