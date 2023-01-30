package og.hlft.fabricatech.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.common.machines.RMachine;
import og.hlft.fabricatech.common.machines.core.MachineTile;
import og.hlft.fabricatech.common.machines.impl.alloy.AlloyingFurnaceTile;

import static og.hlft.fabricatech.Fabricatech.asId;

public class TileRegistry {
    public static void register() {
        machine(AlloyingFurnaceTile::new, RMachines.ALLOYING_FURNACE);
    }

    private static void tile(BlockEntityType<?> tile, String id) {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, asId(id), tile);
    }

    private static void machine(FabricBlockEntityTypeBuilder.Factory<MachineTile> factory, RMachine machine) {
        tile(FabricBlockEntityTypeBuilder.create(factory, machine.getBlock()).build(), machine.machineID);
    }

    public static BlockEntityType<?> getType(String id) {
        return Registry.BLOCK_ENTITY_TYPE.get(asId(id));
    }
}
