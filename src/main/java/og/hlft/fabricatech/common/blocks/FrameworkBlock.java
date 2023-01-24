package og.hlft.fabricatech.common.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class FrameworkBlock extends Block {
    public FrameworkBlock() {
        super(FabricBlockSettings.of(Material.METAL).strength(3.0F));
    }
}
