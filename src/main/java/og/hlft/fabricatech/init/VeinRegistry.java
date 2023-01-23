package og.hlft.fabricatech.init;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.api.veins.OreVein;

public class VeinRegistry {
    public static void register() {
       vein("tin_ore", new OreVein("tin", 6, 11, 63, 2).getStoneOreCf(), new OreVein("tin", 6, 6, 63, 2).getStoneOrePf());
       vein("deepslate_tin_ore", new OreVein("tin", 6, 11, 0, -63).getDeepslateOreCf(), new OreVein("tin", 6, 6, 0, -63).getDeepslateOrePf());
       vein("nickel_ore", new OreVein("nickel", 4, 7, 63, 2).getStoneOreCf(), new OreVein("nickel", 4, 7, 63, 2).getStoneOrePf());
       vein("deepslate_nickel_ore", new OreVein("nickel", 4, 7, 0, -63).getDeepslateOreCf(), new OreVein("nickel", 4, 7, 0, -63).getDeepslateOrePf());
       vein("lead_ore", new OreVein("lead", 4, 7, 63, 2).getStoneOreCf(), new OreVein("lead", 4, 7, 63, 2).getStoneOrePf());
       vein("deepslate_lead_ore", new OreVein("lead", 4, 8, 0, -63).getDeepslateOreCf(), new OreVein("lead", 4, 8, 0, -63).getDeepslateOrePf());
       vein("silver_ore", new OreVein("silver", 2, 5, 63, 2).getStoneOreCf(), new OreVein("silver", 2, 5, 63, 2).getStoneOrePf());
       vein("deepslate_silver_ore", new OreVein("silver", 2, 5, 0, -63).getDeepslateOreCf(), new OreVein("silver", 2, 5, 0, -63).getDeepslateOrePf());
    }
    public static void vein(String id, ConfiguredFeature<?,?> cf, PlacedFeature pf) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, Fabricatech.asId(id), cf);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, Fabricatech.asId(id), pf);
    }
}
