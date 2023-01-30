package og.hlft.fabricatech.common.machines.impl.alloy;

import net.minecraft.block.entity.BlockEntityType;
import og.hlft.fabricatech.common.machines.core.MachineBlock;

public class AlloyingFurnaceBlock extends MachineBlock<AlloyingFurnaceTile> {
    public AlloyingFurnaceBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected BlockEntityType<AlloyingFurnaceTile> getTileType() {
        return null;
    }
}
