package og.hlft.fabricatech.init;

import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.machines.RMachine;

public class RMachines {
    public static final RMachine ALLOYING_FURNACE;

    public static void init() {
        Fabricatech.LOGGER.info("Fabricatech machines loading!");
    }

    static {
        ALLOYING_FURNACE = new RMachine("alloying_furnace").setRecipeID("alloying");
    }
}
