package og.hlft.fabricatech.common.veins;

import java.util.Arrays;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import og.hlft.fabricatech.init.BlockRegistry;

@Deprecated
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
        return new ConfiguredFeature<OreFeatureConfig,Feature<OreFeatureConfig>>(Feature.ORE, new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                BlockRegistry.getBlock(id + "_ore").getDefaultState(),
                this.veinSize
        ));
    }

    public ConfiguredFeature<?, ?> getDeepslateOreCf() {
        return new ConfiguredFeature<OreFeatureConfig,Feature<OreFeatureConfig>>(Feature.ORE, new OreFeatureConfig(
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
