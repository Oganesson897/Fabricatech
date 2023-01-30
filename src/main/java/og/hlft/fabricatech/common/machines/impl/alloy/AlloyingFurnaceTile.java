package og.hlft.fabricatech.common.machines.impl.alloy;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import og.hlft.fabricatech.common.machines.core.MachineTile;
import og.hlft.fabricatech.init.RMachines;
import org.jetbrains.annotations.Nullable;

public class AlloyingFurnaceTile extends MachineTile {

    public AlloyingFurnaceTile(BlockPos pos, BlockState state) {
        super(pos, state, RMachines.ALLOYING_FURNACE);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return null;
    }

    @Override
    public ItemStack[] getInput() {
        return new ItemStack[0];
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {

    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        return new int[0];
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return false;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return false;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return null;
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText(rMachine.getMachineName());
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return null;
    }
}
