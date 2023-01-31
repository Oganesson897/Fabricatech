package og.hlft.fabricatech.init;

import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.machines.RMachine;

public class RMachines {
    public static final RMachine ALLOYING_FURNACE;
    public static final RMachine MACERATOR;
    public static final RMachine ENERGY_FURNACE;
    public static final RMachine ARC_FURNACE;
    public static final RMachine CIRCUIT_ETCHER;
    public static final RMachine COMPRESSOR;
    public static final RMachine CENTRIFUGE;
    public static final RMachine MIXER;

    public static void init() {
        Fabricatech.LOGGER.info("Fabricatech machines loading!");
    }

    static {
        ALLOYING_FURNACE = new RMachine("alloying_furnace").setRecipeID("alloying");
        MACERATOR = new RMachine("macerator").setRecipeID("crushed");
        ENERGY_FURNACE = new RMachine("energy_furnace").setRecipeID("smelting");
        ARC_FURNACE = new RMachine("arc_furnace").setRecipeID("arc_smelting");
        CIRCUIT_ETCHER = new RMachine("circuit_etcher").setRecipeID("etching");
        COMPRESSOR = new RMachine("compressor").setRecipeID("compress");
        CENTRIFUGE = new RMachine("centrifuge").setRecipeID("centrifugal");
        MIXER = new RMachine("mixer").setRecipeID("mixin");
    }
}
