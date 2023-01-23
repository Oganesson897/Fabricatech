package og.hlft.fabricatech.api.materials;

import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.Fabricatech;

import java.util.ArrayList;

public class Material {
    private String id;

    private ArrayList<MaterialPart> itemParts;

    private ArrayList<MaterialBlockPart> blockParts;

    public Material(String id) {
        this.id = id;
    }

    public void setItemPart(ArrayList<MaterialPart> parts) {
        this.itemParts = parts;
        for (int i = 0; i < parts.size(); i++) {
            Registry.register(Registry.ITEM, Fabricatech.asId(this.id + parts.get(i).getID()), parts.get(i).getItem());
        }
    }

    public void setBlockPart(ArrayList<MaterialBlockPart> parts) {
        this.blockParts = parts;
        for (int i = 0; i < parts.size(); i++) {
            Registry.register(Registry.BLOCK, Fabricatech.asId(this.id + parts.get(i).getID()), parts.get(i).getBlock());
            Registry.register(Registry.ITEM, Fabricatech.asId(this.id + parts.get(i).getID()), parts.get(i).getBlockItem());
        }
    }
}
