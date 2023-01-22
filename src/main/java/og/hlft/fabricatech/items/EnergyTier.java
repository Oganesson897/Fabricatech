package og.hlft.fabricatech.items;

public enum EnergyTier {
    TEST(40000, 1000, 1000);
    public final long capacity;
    public final long maxInput;
    public final long maxOutput;

    EnergyTier(long capacity, long maxInput, long maxOutput) {
        this.capacity = capacity;
        this.maxInput = maxInput;
        this.maxOutput = maxOutput;
    }
}
