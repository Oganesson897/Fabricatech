package og.hlft.fabricatech.common.machines;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.NotNull;

public abstract class MachineScreenHandler extends ScreenHandler {
    protected MachineScreenHandler(@NotNull ScreenHandlerType<?> type, int syncId, PacketByteBuf buf) {
        super(type, syncId);
    }
}
