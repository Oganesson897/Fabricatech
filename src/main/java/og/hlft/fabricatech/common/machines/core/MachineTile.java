package og.hlft.fabricatech.common.machines.core;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.math.BlockPos;
import og.hlft.fabricatech.common.machines.RMachine;
import og.hlft.fabricatech.init.TileRegistry;
import org.jetbrains.annotations.NotNull;

public abstract class MachineTile extends BlockEntity implements MachineInv {
    protected final RMachine rMachine;
    public MachineTile(BlockPos pos, BlockState state, RMachine rMachine) {
        super(TileRegistry.getType(rMachine.machineID), pos, state);
        this.rMachine = rMachine;
    }

    @NotNull
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public void inventoryChanged() {
        markDirty();
        if (world != null) {
            world.updateListeners(getPos(), getCachedState(), getCachedState(), (1) | (1 << 1));
        }
    }

    @Override
    public RecipeType<?> getRecipeType() {
        return rMachine.getRecipeType();
    }
}
