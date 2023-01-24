package og.hlft.fabricatech.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.blocks.FrameworkBlocks;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.common.materials.RMaterials;

import static og.hlft.fabricatech.Fabricatech.asId;

public class BlockRegistry {
    public static void register() {
        material(RMaterials.TIN);
        material(RMaterials.LEAD);
        material(RMaterials.NICKEL);
        material(RMaterials.SILVER);

        block("bronze_machine_framework", new FrameworkBlocks());
        block("steel_machine_framework", new FrameworkBlocks());
        block("tungsten_machine_framework", new FrameworkBlocks());
    }

    public static void material(RMaterial material) {
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

    public static void block(String id, Block block) {
        Registry.register(Registry.BLOCK, Fabricatech.asId(id), block);
    }
    public static void block(String id, AbstractBlock.Settings settings) {
        Registry.register(Registry.BLOCK, Fabricatech.asId(id), new Block(settings));
    }

    public static Block getBlock(String id) {
        return Registry.BLOCK.get(asId(id));
    }
}
