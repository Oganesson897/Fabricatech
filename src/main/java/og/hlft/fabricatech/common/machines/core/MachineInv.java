package og.hlft.fabricatech.common.machines.core;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.collection.DefaultedList;

public interface MachineInv extends SidedInventory, ExtendedScreenHandlerFactory {
    DefaultedList<ItemStack> getItems();

    @Nullable
    RecipeType<?> getRecipeType();

    ItemStack[] getInput();

    @Override
    default int size() {
        return getItems().size();
    }

    @Override
    default boolean isEmpty() {
        for (int i = 0; i < size(); i++) {
            ItemStack stack = getStack(i);
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    default ItemStack getStack(int slot) {
        return getItems().get(slot);
    }

    @Override
    default ItemStack removeStack(int slot, int count) {
        ItemStack result = Inventories.splitStack(getItems(), slot, count);
        if (!result.isEmpty()) {
            inventoryChanged();
        }
        return result;
    }

    @Override
    default void setStack(int slot, ItemStack stack) {
        ItemStack itemStack = stack.copy();
        getItems().set(slot, itemStack);
        inventoryChanged();
    }

    @Override
    default void clear() {
        for (int i = 0; i < size(); i++) {
            removeStack(i);
        }
    }

    @Override
    default boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    void inventoryChanged();
}
