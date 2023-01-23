package og.hlft.fabricatech.common.materials;

import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.Fabricatech;

import java.util.ArrayList;

public class Material {
    private final String id;

    private ArrayList<MaterialPart> itemParts;

    private ArrayList<MaterialBlockPart> blockParts;

    public Material(String id) {
        this.id = id;
    }

    public Material setItemPart(ArrayList<MaterialPart> parts) {
        this.itemParts = parts;
        for (MaterialPart part : parts) {
            Registry.register(Registry.ITEM, Fabricatech.asId(this.id + part.getID()), part.getItem());
        }
        return this;
    }

    public Material setBlockPart(ArrayList<MaterialBlockPart> parts) {
        this.blockParts = parts;
        for (MaterialBlockPart part : parts) {
            Registry.register(Registry.BLOCK, Fabricatech.asId(this.id + part.getID()), part.getBlock());
            Registry.register(Registry.ITEM, Fabricatech.asId(this.id + part.getID()), part.getBlockItem());
        }
        return this;
    }

    public ArrayList<MaterialPart> getItemParts() {
        return itemParts;
    }

    public ArrayList<MaterialBlockPart> getBlockParts() {
        return blockParts;
    }

    public Material build() {
        return this;
    }
}
