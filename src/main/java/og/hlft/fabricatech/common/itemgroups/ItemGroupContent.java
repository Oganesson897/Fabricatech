package og.hlft.fabricatech.common.itemgroups;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public interface ItemGroupContent {

    /**
     * @return The {@code ItemGroup} in. Can be null if not in any ItemGroup.
     */
    @Nullable
    ItemGroup getItemGroup();

    /**
     * Append stacks to {@code FabricItemGroupEntries}.
     * @param entries The input {@code FabricItemGroupEntries}.
     */
    default void appendStacks(FabricItemGroupEntries entries) {
        if (this instanceof Item item)
            entries.add(item);
    }

}
