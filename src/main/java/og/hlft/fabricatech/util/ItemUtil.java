package og.hlft.fabricatech.util;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import og.hlft.fabricatech.common.items.impl.ElectricItem;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemUtil {
    public static void energyToolTip(ElectricItem electricItem, ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        Text text = new TranslatableText("tip.item.energy").formatted(Formatting.AQUA)
                .append(String.valueOf(electricItem.getStoredEnergy(stack)))
                .append("/")
                .append(String.valueOf(electricItem.getEnergyCapacity(stack)))
                .append("(E)");
        tooltip.add(text);
    }

    public static void appendFourItem(DefaultedList<ItemStack> itemList, ElectricItem item) {
        for (int i = 1; i <= 4; i++) {
            ItemStack energy = new ItemStack(item);
            item.setStoredEnergy(energy, item.getEnergyCapacity(energy) * i/4);
            itemList.add(energy);
        }
    }

    public static void appendItem(DefaultedList<ItemStack> itemList, ElectricItem item) {
        ItemStack energy = new ItemStack(item);
        item.setStoredEnergy(energy, item.getEnergyCapacity(energy));
        itemList.add(energy);
    }
}
