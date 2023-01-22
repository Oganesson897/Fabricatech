package og.hlft.fabricatech.init;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import team.reborn.energy.api.base.SimpleEnergyItem;

@Environment(EnvType.CLIENT)
public class ItemPredicateRegistry {
    public static void register() {
        energyPredicate(ItemRegistry.getItem("battery"));
    }

    public static void energyPredicate(Item item) {
        ModelPredicateProviderRegistry.register(item, new Identifier("energy"), (stack, world, entity, seed) -> {
            if (stack.getItem() instanceof SimpleEnergyItem energyItem) {
                return ((float) energyItem.getStoredEnergy(stack)) / ((float) energyItem.getEnergyCapacity(stack));
            }
            return 0.0F;
        });
    }
}
