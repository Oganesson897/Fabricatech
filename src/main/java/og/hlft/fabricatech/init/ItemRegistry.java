package og.hlft.fabricatech.init;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.items.impl.BatteryItem;
import og.hlft.fabricatech.common.items.EnergyTiers;

import static og.hlft.fabricatech.Fabricatech.TAB;
import static og.hlft.fabricatech.Fabricatech.asId;


public class ItemRegistry {
    public static void register() {
        item("battery", new BatteryItem(settings(), EnergyTiers.TEST));
    }

    public static void item(String id, Item item) {
        Registry.register(Registry.ITEM, Fabricatech.asId(id), item);
    }

    public static Item.Settings settings() {
        return new Item.Settings().group(TAB);
    }

    public static Item getItem(String id) {
        return Registry.ITEM.get(asId(id));
    }
}
