package og.hlft.fabricatech.api.materials;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import og.hlft.fabricatech.Fabricatech;

public class MaterialBlockPart {

    private String id;
    public MaterialBlockPart(String id) {
        this.id = id;
    }

    public Block getBlock() {
        return new Block(FabricBlockSettings.of(Material.METAL).strength(3.0F));
    }

    public Item getBlockItem() {
        return new BlockItem(getBlock(), new FabricItemSettings().group(Fabricatech.TAB));
    }

    public String getID() {
        return this.id;
    }

}
