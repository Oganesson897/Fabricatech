package og.hlft.yjn.fabricatech.common.items.impl;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import team.reborn.energy.api.base.SimpleEnergyItem;

public class ElectricItem extends Item implements SimpleEnergyItem {
    public final SimpleEnergyItem energyTier;

    public ElectricItem(Settings settings, SimpleEnergyItem tier) {
        super(settings.maxCount(1));
        this.energyTier = tier;
    }

    @Override
    public long getEnergyCapacity(ItemStack stack) {
        return energyTier.getEnergyCapacity(stack);
    }

    @Override
    public long getEnergyMaxInput(ItemStack stack) {
        return energyTier.getEnergyMaxInput(stack);
    }

    @Override
    public long getEnergyMaxOutput(ItemStack stack) {
        return energyTier.getEnergyMaxOutput(stack);
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        return true;
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return 0x00FFEB;
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        if (!(stack.getItem() instanceof ElectricItem electricItem)) {
            throw new UnsupportedOperationException();
        }

        return Math.round((electricItem.getStoredEnergy(stack) * 100f / electricItem.getEnergyCapacity(stack)) * 13) / 100;
    }
}
