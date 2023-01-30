package og.hlft.yjn.fabricatech.init;

import net.minecraft.block.MapColor;
import og.hlft.yjn.fabricatech.Fabricatech;
import og.hlft.yjn.fabricatech.common.materials.RMaterial;
import og.hlft.yjn.fabricatech.common.materials.RMaterialPart;

public class RMaterials {
    public static final RMaterial TIN;
    public static final RMaterial NICKEL;
    public static final RMaterial LEAD;
    public static final RMaterial SILVER;
    public static final RMaterial IRON;
    public static final RMaterial GOLD;
    public static final RMaterial COPPER;

    public static void init() {
        Fabricatech.LOGGER.info("Fabricatech materials loading!");
    }

    static {
        TIN = new RMaterial("tin").setChinese("锡").setColor(MapColor.LIGHT_BLUE_GRAY).setParts(RMaterialPart.values());
        NICKEL = new RMaterial("nickel").setChinese("镍").setColor(MapColor.PALE_YELLOW).setParts(RMaterialPart.values());
        LEAD = new RMaterial("lead").setChinese("铅").setColor(MapColor.PALE_PURPLE).setParts(RMaterialPart.values());
        SILVER = new RMaterial("silver").setChinese("银").setColor(MapColor.LIGHT_GRAY).setParts(RMaterialPart.values());

        IRON = new RMaterial("iron").setChinese("铁").setParts(RMaterialPart.vanilla());
        GOLD = new RMaterial("gold").setChinese("金").setParts(RMaterialPart.vanilla());
        COPPER = new RMaterial("copper").setChinese("铜").setParts(RMaterialPart.vanilla());
    }
}
