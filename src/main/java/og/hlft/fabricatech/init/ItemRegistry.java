package og.hlft.fabricatech.init;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;


public class ItemRegistry {
    public static void register() {

    }

    public static void item(String id, Item item) {
        Registry.register(Registry.ITEM, Utils)
    }
}
