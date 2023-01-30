package og.hlft.fabricatech.common.veins;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import og.hlft.fabricatech.init.BlockRegistry;

import java.util.Arrays;

public class OreVein {
    private final String id;
    private final int veinSize;
    private final int perChunks;
    private final int maxHeight;
    private final int minHeight;

    public OreVein(String id, int veinSize, int perChunks, int maxHeight, int minHeight) {
        this.veinSize = veinSize;
        this.id = id;
        this.perChunks = perChunks;
        this.maxHeight = maxHeight;
        this.minHeight = minHeight;
    }

    public ConfiguredFeature<?, ?> getStoneOreCf() {
        return new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                BlockRegistry.getBlock(id + "_ore").getDefaultState(),
                this.veinSize
        ));
    }

    public ConfiguredFeature<?, ?> getDeepslateOreCf() {
        return new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(
                OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                BlockRegistry.getBlock("deepslate_" + id + "_ore").getDefaultState(),
                this.veinSize
        ));
    }

    public PlacedFeature getStoneOrePf() {
        return new PlacedFeature(RegistryEntry.of(getStoneOreCf()),
                Arrays.asList(
                        CountPlacementModifier.of(this.perChunks),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.fixed(this.minHeight), YOffset.fixed(this.maxHeight))));
    }

    public PlacedFeature getDeepslateOrePf() {
        return new PlacedFeature(RegistryEntry.of(getDeepslateOreCf()),
                Arrays.asList(
                        CountPlacementModifier.of(this.perChunks),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.fixed(this.minHeight), YOffset.fixed(this.maxHeight))));
    }
}
