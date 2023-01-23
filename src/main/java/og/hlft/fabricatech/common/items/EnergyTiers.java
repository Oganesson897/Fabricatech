package og.hlft.fabricatech.common.items;

import net.minecraft.item.ItemStack;
import team.reborn.energy.api.base.SimpleEnergyItem;

public enum EnergyTiers implements SimpleEnergyItem {

    TEST(400000, 10000, 1000);

    public final long capacity;
    public final long maxInput;
    public final long maxOutput;

    EnergyTiers(long capacity, long maxInput, long maxOutput) {
        this.capacity = capacity;
        this.maxInput = maxInput;
        this.maxOutput = maxOutput;
    }

    @Override
    public long getEnergyCapacity(ItemStack stack) {
        return capacity;
    }

    @Override
    public long getEnergyMaxInput(ItemStack stack) {
        return maxInput;
    }

    @Override
    public long getEnergyMaxOutput(ItemStack stack) {
        return maxOutput;
    }
}
