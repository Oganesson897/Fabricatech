package og.hlft.fabricatech.init;

import og.hlft.fabricatech.api.materials.Material;
import og.hlft.fabricatech.api.materials.MaterialBlockParts;
import og.hlft.fabricatech.api.materials.MaterialParts;

public class MaterialRegistry {
    public static final Material TIN;
    public static final Material NICKEL;
    public static final Material LEAD;
    public static final Material SILVER;

    static {
        TIN = new Material("tin").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
        NICKEL = new Material("nickel").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
        LEAD = new Material("lead").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
        SILVER = new Material("silver").setItemPart(MaterialParts.ALL).setBlockPart(MaterialBlockParts.ALL);
    }
}
