package og.hlft.fabricatech.init;

import og.hlft.fabricatech.common.materials.Material;
import og.hlft.fabricatech.common.materials.MaterialBlockParts;
import og.hlft.fabricatech.common.materials.MaterialParts;

public class MaterialRegistry {
    public static Material TIN;
    public static Material NICKEL;
    public static Material LEAD;
    public static Material SILVER;

    public static void register() {
        TIN = new Material("tin").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
        NICKEL = new Material("nickel").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
        LEAD = new Material("lead").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
        SILVER = new Material("silver").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
    }
}
