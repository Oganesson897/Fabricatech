package og.hlft.fabricatech.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.blocks.FrameBlock;
import og.hlft.fabricatech.common.machines.RMachine;
import og.hlft.fabricatech.common.machines.core.MachineBlock;
import og.hlft.fabricatech.common.machines.impl.alloy.AlloyingFurnaceBlock;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;

import static og.hlft.fabricatech.Fabricatech.asId;

public class BlockRegistry {
    public static void register() {
        material(RMaterials.TIN);
        material(RMaterials.LEAD);
        material(RMaterials.NICKEL);
        material(RMaterials.SILVER);

        block("bronze_machine_frame", new FrameBlock());
        block("steel_machine_frame", new FrameBlock());

        machine(new AlloyingFurnaceBlock(metal()), RMachines.ALLOYING_FURNACE);
    }

    private static void machine(MachineBlock<?> block, RMachine machine) {
        block(machine.machineID, block);
    }

    private static void material(RMaterial material) {
        for (RMaterialPart part : material.getBlockParts()) {
            if (part == RMaterialPart.RAW_BLOCK)
                block(material.makeRID(part), rawMetal().mapColor(material.getColor()));
            else
                block(material.makeRID(part), metal().mapColor(material.getColor()));
        }
    }

    public static AbstractBlock.Settings metal() {
        return FabricBlockSettings.copy(Blocks.IRON_BLOCK);
    }

    public static AbstractBlock.Settings rawMetal() {
        return FabricBlockSettings.copy(Blocks.RAW_IRON_BLOCK);
    }

    private static void block(String id, Block block) {
        Registry.register(Registry.BLOCK, Fabricatech.asId(id), block);
    }

    private static void block(String id, AbstractBlock.Settings settings) {
        block(id, new Block(settings));
    }

    public static Block getBlock(String id) {
        return Registry.BLOCK.get(asId(id));
    }
}
