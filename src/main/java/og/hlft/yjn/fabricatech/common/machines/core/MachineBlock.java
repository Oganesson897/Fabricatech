package og.hlft.yjn.fabricatech.common.machines.core;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public abstract class MachineBlock<T extends MachineTile> extends BlockWithEntity implements BlockEntityProvider {
    public MachineBlock(Settings settings) {
        super(settings);
    }

    @Deprecated
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return getTileType().instantiate(pos, state);
    }

    protected abstract BlockEntityType<T> getTileType();
}
