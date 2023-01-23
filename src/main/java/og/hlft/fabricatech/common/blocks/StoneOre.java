package og.hlft.fabricatech.common.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;

public class StoneOre extends OreBlock {
    public StoneOre() {
        super(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).requiresTool());
    }
}
