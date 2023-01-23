package og.hlft.fabricatech.api.materials;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import og.hlft.fabricatech.Fabricatech;

public class MaterialPart {

    private final String id;
    public MaterialPart(String id) {
        this.id = id;
    }

    public Item getItem() {
        return new Item(new FabricItemSettings().group(Fabricatech.TAB));
    }

    public String getID() {
        return this.id;
    }
}
