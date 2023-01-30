package og.hlft.fabricatech.common.machines.core;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import og.hlft.fabricatech.common.machines.RMachine;
import og.hlft.fabricatech.util.ItemUtil;

public class MachineRecipe<T extends RMachine> implements Recipe<MachineTile> {
    public T rMachine;
    private final Identifier id;

    protected final Ingredient[] inputs;
    protected final ItemStack[] outputs;
    protected final int energy;
    protected final int time;

    public MachineRecipe(T rMachine, Identifier id, Ingredient[] inputs, ItemStack[] outputs, int time, int energy) {
        this.id = id;
        this.inputs = inputs;
        this.outputs = outputs;
        this.time = time;
        this.energy = energy;
        this.rMachine = rMachine;
    }

    @Override
    public boolean matches(MachineTile inventory, World world) {
        return ItemUtil.compare(inventory.getInput(), inputs);
    }

    @Override
    public ItemStack craft(MachineTile inventory) {
        return outputs[0];
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput() {
        return outputs[0];
    }

    @Override
    public Identifier getId() {
        return this.id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return rMachine.getRecipeSerializer();
    }

    @Override
    public RecipeType<?> getType() {
        return rMachine.getRecipeType();
    }

}
