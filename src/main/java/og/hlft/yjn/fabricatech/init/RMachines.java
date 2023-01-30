package og.hlft.yjn.fabricatech.init;

import og.hlft.yjn.fabricatech.Fabricatech;
import og.hlft.yjn.fabricatech.common.machines.RMachine;

public class RMachines {
    public static final RMachine ALLOYING_FURNACE;
    public static final RMachine MACERATOR;

    public static void init() {
        Fabricatech.LOGGER.info("Fabricatech machines loading!");
    }

    static {
        ALLOYING_FURNACE = new RMachine("alloying_furnace").setRecipeID("alloying");
        MACERATOR = new RMachine("macerator").setRecipeID("macerator");
    }
}
