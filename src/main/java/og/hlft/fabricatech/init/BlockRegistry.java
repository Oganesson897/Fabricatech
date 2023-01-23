package og.hlft.fabricatech.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.Fabricatech;

import static og.hlft.fabricatech.Fabricatech.asId;

public class BlockRegistry {
    public static void register() {
        block("raw_tin_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_BLUE_GRAY).requiresTool().strength(5.0F, 6.0F)));
        block("raw_nickel_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(5.0F, 6.0F)));
        block("raw_lead_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_PURPLE).requiresTool().strength(5.0F, 6.0F)));
        block("raw_silver_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).requiresTool().strength(5.0F, 6.0F)));
    }

    public static void block(String id, Block block) {
        Registry.register(Registry.BLOCK, Fabricatech.asId(id), block);
        Registry.register(Registry.ITEM, Fabricatech.asId(id), new BlockItem(block, ItemRegistry.settings()));
    }

    public static Block getBlock(String id) {
        return Registry.BLOCK.get(asId(id));
    }
}
