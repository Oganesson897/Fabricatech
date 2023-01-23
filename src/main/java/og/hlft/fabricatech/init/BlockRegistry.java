package og.hlft.fabricatech.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.blocks.DeepslateOre;
import og.hlft.fabricatech.common.blocks.StoneOre;

import static og.hlft.fabricatech.Fabricatech.TAB;
import static og.hlft.fabricatech.Fabricatech.asId;

public class BlockRegistry {
    public static void register() {
        block("tin_ore", new StoneOre());
        block("deepslate_tin_ore", new DeepslateOre());
        block("nickel_ore", new StoneOre());
        block("deepslate_nickel_ore", new DeepslateOre());
        block("lead_ore", new StoneOre());
        block("deepslate_lead_ore", new DeepslateOre());
        block("silver_ore", new StoneOre());
        block("deepslate_silver_ore", new DeepslateOre());

        block("raw_tin_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_BLUE_GRAY).requiresTool().strength(5.0F, 6.0F)));
        block("raw_nickel_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(5.0F, 6.0F)));
        block("raw_lead_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_PURPLE).requiresTool().strength(5.0F, 6.0F)));
        block("raw_silver_block", new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).requiresTool().strength(5.0F, 6.0F)));
    }

    public static void block(String id, Block block) {
        Registry.register(Registry.BLOCK, Fabricatech.asId(id), block);
        Registry.register(Registry.ITEM, Fabricatech.asId(id), new BlockItem(block, new FabricItemSettings().group(TAB)));
    }

    public static Block getBlock(String id) {
        return Registry.BLOCK.get(asId(id));
    }
}
