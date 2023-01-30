package og.hlft.fabricatech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.init.BlockRegistry;
import og.hlft.fabricatech.init.ItemPredicateRegistry;
import og.hlft.fabricatech.init.ItemRegistry;
import og.hlft.fabricatech.init.RMachines;
import og.hlft.fabricatech.init.RMaterials;
import og.hlft.fabricatech.init.RecipeRegistry;

public class Fabricatech implements ModInitializer, ClientModInitializer {
    public static final String MOD_NAME = "Fabricatech";
    public static final String MOD_ID = "fabricatech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static final ItemGroup TAB = FabricItemGroup.builder(new Identifier(MOD_ID, "main"))
            .icon(() -> Registries.ITEM.get(asId("battery")).getDefaultStack()).build();

    public static final ItemGroup MATERIALS_TAB = FabricItemGroup.builder(new Identifier(MOD_ID, "materials"))
            .icon(() -> RMaterials.GOLD.getPartItem(RMaterialPart.GEAR).getDefaultStack()).build();

    @Override
    public void onInitialize() {
        RMaterials.init();
        RMachines.init();

        RecipeRegistry.register();
        BlockRegistry.register();
        ItemRegistry.register();

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
