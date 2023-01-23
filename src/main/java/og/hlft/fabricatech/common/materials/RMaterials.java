package og.hlft.fabricatech.common.materials;

import net.minecraft.block.MapColor;

public class RMaterials {
    public static RMaterial TIN;
    public static RMaterial NICKEL;
    public static RMaterial LEAD;
    public static RMaterial SILVER;
    public static RMaterial IRON;
    public static RMaterial GOLD;
    public static RMaterial COPPER;

    public static void init() {
        TIN = new RMaterial("tin").setColor(MapColor.LIGHT_BLUE_GRAY).setParts(RMaterialPart.values());
        NICKEL = new RMaterial("nickel").setColor(MapColor.PALE_YELLOW).setParts(RMaterialPart.values());
        LEAD = new RMaterial("lead").setColor(MapColor.PALE_PURPLE).setParts(RMaterialPart.values());
        SILVER = new RMaterial("silver").setColor(MapColor.LIGHT_GRAY).setParts(RMaterialPart.values());

        IRON = new RMaterial("iron").setParts(RMaterialPart.vanilla());
        GOLD = new RMaterial("gold").setParts(RMaterialPart.vanilla());
        COPPER = new RMaterial("copper").setParts(RMaterialPart.vanilla());
    }
}
