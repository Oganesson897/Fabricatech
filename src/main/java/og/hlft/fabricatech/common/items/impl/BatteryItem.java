package og.hlft.fabricatech.common.items.impl;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import og.hlft.fabricatech.util.ItemUtil;
import team.reborn.energy.api.base.SimpleEnergyItem;

public class BatteryItem extends ElectricItem {
    public BatteryItem(Settings settings, SimpleEnergyItem tier) {
        super(settings, tier);
    }

    @Override
    public void appendStacks(FabricItemGroupEntries entries) {
        ItemUtil.appendFourItem(entries, this);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        ItemUtil.energyToolTip(this, stack, world, tooltip, context);
    }
}
