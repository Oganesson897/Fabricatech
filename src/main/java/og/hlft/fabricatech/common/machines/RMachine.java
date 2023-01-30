package og.hlft.fabricatech.common.machines;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import og.hlft.fabricatech.common.machines.core.MachineRecipeSerializer;
import og.hlft.fabricatech.common.machines.core.MachineRecipeType;
import og.hlft.fabricatech.datagen.RLangProvider;
import og.hlft.fabricatech.init.BlockRegistry;
import og.hlft.fabricatech.init.ItemRegistry;

public class RMachine {
    public final String machineID;
    public String recipeID;
    protected final String machineName;
    private RecipeType<?> machineRecipeType;
    private RecipeSerializer<?> machineRecipeSerializer;

    public RMachine(String machineID) {
        this(machineID, RLangProvider.beautifyName(machineID));
    }

    public RMachine(String machineID, String machineName) {
        this.machineID = machineID;
        this.machineName = machineName;
        this.machineRecipeType = new MachineRecipeType();
        this.machineRecipeSerializer = new MachineRecipeSerializer(this);
    }

    public RMachine setRecipeID(String recipeID) {
        this.recipeID = recipeID;
        return this;
    }

    public RMachine setRecipeType(RecipeType<?> type) {
        this.machineRecipeType = type;
        return this;
    }

    public RMachine setRecipeSerializer(RecipeSerializer<?> serializer) {
        this.machineRecipeSerializer = serializer;
        return this;
    }

    public Item getItem() {
        return ItemRegistry.getItem(machineID);
    }

    public Block getBlock() {
        return BlockRegistry.getBlock(machineID);
    }

    public RecipeType<?> getRecipeType() {
        return machineRecipeType;
    }

    public RecipeSerializer<?> getRecipeSerializer() {
        return machineRecipeSerializer;
    }

    public String getMachineName() {
        return machineName;
    }
}
