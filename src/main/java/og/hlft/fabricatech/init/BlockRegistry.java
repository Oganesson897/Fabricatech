package og.hlft.fabricatech.init;

import static og.hlft.fabricatech.Fabricatech.asId;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.blocks.FrameBlock;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;

public class BlockRegistry {
    public static void register() {
        material(RMaterials.TIN);
        material(RMaterials.LEAD);
        material(RMaterials.NICKEL);
        material(RMaterials.SILVER);

        block("bronze_machine_frame", new FrameBlock());
        block("steel_machine_frame", new FrameBlock());
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
        Registry.register(Registries.BLOCK, Fabricatech.asId(id), block);
    }

    private static void block(String id, AbstractBlock.Settings settings) {
        block(id, new Block(settings));
    }

    public static Block getBlock(String id) {
        return Registries.BLOCK.get(asId(id));
    }
}
