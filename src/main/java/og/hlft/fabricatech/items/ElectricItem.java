package og.hlft.fabricatech.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import team.reborn.energy.api.base.SimpleEnergyItem;

public class ElectricItem extends Item implements SimpleEnergyItem {
    public final EnergyTier energyTier;

    public ElectricItem(Settings settings, EnergyTier tier) {
        super(settings);
        this.energyTier = tier;
    }

    @Override
    public long getEnergyCapacity(ItemStack stack) {
        return energyTier.capacity;
    }

    @Override
    public long getEnergyMaxInput(ItemStack stack) {
        return energyTier.maxInput;
    }

    @Override
    public long getEnergyMaxOutput(ItemStack stack) {
        return energyTier.maxOutput;
    }
}
