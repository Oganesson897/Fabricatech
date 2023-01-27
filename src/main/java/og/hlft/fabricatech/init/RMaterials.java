package og.hlft.fabricatech.init;

import net.minecraft.block.MapColor;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;

public class RMaterials {
    public static RMaterial TIN;
    public static RMaterial NICKEL;
    public static RMaterial LEAD;
    public static RMaterial SILVER;
    public static RMaterial IRON;
    public static RMaterial GOLD;
    public static RMaterial COPPER;

    public static void init() {
        TIN = new RMaterial("tin").setChinese("锡").setColor(MapColor.LIGHT_BLUE_GRAY).setParts(RMaterialPart.values());
        NICKEL = new RMaterial("nickel").setChinese("镍").setColor(MapColor.PALE_YELLOW).setParts(RMaterialPart.values());
        LEAD = new RMaterial("lead").setChinese("铅").setColor(MapColor.PALE_PURPLE).setParts(RMaterialPart.values());
        SILVER = new RMaterial("silver").setChinese("银").setColor(MapColor.LIGHT_GRAY).setParts(RMaterialPart.values());

        IRON = new RMaterial("iron").setChinese("铁").setParts(RMaterialPart.vanilla());
        GOLD = new RMaterial("gold").setChinese("金").setParts(RMaterialPart.vanilla());
        COPPER = new RMaterial("copper").setChinese("铜").setParts(RMaterialPart.vanilla());
    }
}
