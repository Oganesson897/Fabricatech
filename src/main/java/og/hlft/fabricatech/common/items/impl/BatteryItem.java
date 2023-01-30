package og.hlft.fabricatech.common.items.impl;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import og.hlft.fabricatech.util.ItemUtil;
import org.jetbrains.annotations.Nullable;
import team.reborn.energy.api.base.SimpleEnergyItem;

import java.util.List;

public class BatteryItem extends ElectricItem {
    public BatteryItem(Settings settings, SimpleEnergyItem tier) {
        super(settings, tier);
    }

    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> itemList) {
        if (!isIn(group)) {
            return;
        }
        ItemUtil.appendFourItem(itemList, this);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        ItemUtil.energyToolTip(this, stack, world, tooltip, context);
    }
}
