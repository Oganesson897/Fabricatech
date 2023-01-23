package og.hlft.fabricatech.common.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;

public class DeepslateOre extends OreBlock {
    public DeepslateOre() {
        super(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).requiresTool().strength(4.5F, 4.0F).sounds(BlockSoundGroup.DEEPSLATE));
    }
}
