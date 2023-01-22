package og.hlft.fabricatech.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import team.reborn.energy.api.base.SimpleEnergyItem;

public class ElectricItem extends Item implements SimpleEnergyItem {
    public final EnergyTier energyTier;
    public double COPh = 1.0;

    public ElectricItem(Settings settings, EnergyTier tier) {
        super(settings);
        this.energyTier = tier;
    }

    @Override
    public long getEnergyCapacity(ItemStack stack) {
        return (long) (energyTier.capacity * COPh);
    }

    @Override
    public long getEnergyMaxInput(ItemStack stack) {
        return (long) (energyTier.maxInput * COPh);
    }

    @Override
    public long getEnergyMaxOutput(ItemStack stack) {
        return (long) (energyTier.maxOutput * COPh);
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
