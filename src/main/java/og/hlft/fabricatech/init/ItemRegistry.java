package og.hlft.fabricatech.init;

import static og.hlft.fabricatech.Fabricatech.asId;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.items.EnergyTiers;
import og.hlft.fabricatech.common.items.base.BaseBlockItem;
import og.hlft.fabricatech.common.items.base.BaseItem;
import og.hlft.fabricatech.common.items.base.BaseMaterialBlockItem;
import og.hlft.fabricatech.common.items.base.BaseMaterialItem;
import og.hlft.fabricatech.common.items.impl.BatteryItem;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;

@SuppressWarnings("unused")
public class ItemRegistry {
    public static void register() {
        item("battery", new BatteryItem(settings(), EnergyTiers.TEST));

        material(RMaterials.COPPER);
        material(RMaterials.GOLD);
        material(RMaterials.IRON);

        material(RMaterials.TIN);
        material(RMaterials.LEAD);
        material(RMaterials.NICKEL);
        material(RMaterials.SILVER);
    }

    protected static void material(RMaterial material) {
        for (RMaterialPart part : material.getItemParts())
            simpleMaterial(material.makeRID(part));

        for (RMaterialPart part : material.getBlockParts())
            materialBlockItem(material.makeRID(part), settings());
    }

    private static void simpleItem(String id) {
        item(id, new BaseItem(settings()));
    }

    private static void simpleMaterial(String id) {
        item(id, new BaseMaterialItem(settings()));
    }

    private static void blockItem(String id, Item.Settings settings) {
        item(id, new BaseBlockItem(Registries.BLOCK.get(asId(id)), settings));
    }

    private static void materialBlockItem(String id, Item.Settings settings) {
        item(id, new BaseMaterialBlockItem(Registries.BLOCK.get(asId(id)), settings));
    }

    private static void item(String id, Item item) {
        Registry.register(Registries.ITEM, Fabricatech.asId(id), item);
    }

    public static Item.Settings settings() {
        return new FabricItemSettings();
    }

    public static Item getItem(String id) {
        return Registries.ITEM.get(asId(id));
    }
}
