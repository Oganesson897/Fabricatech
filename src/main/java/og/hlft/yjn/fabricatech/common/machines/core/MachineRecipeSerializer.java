package og.hlft.yjn.fabricatech.common.machines.core;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import og.hlft.yjn.fabricatech.common.machines.RMachine;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.recipe.ShapedRecipe.outputFromJson;

public class MachineRecipeSerializer<T extends RMachine> implements RecipeSerializer<MachineRecipe<T>> {
    public T rMachine;

    public MachineRecipeSerializer(T rMachine) {
        this.rMachine = rMachine;
    }

    @Override
    public MachineRecipe<T> read(Identifier id, JsonObject json) {
        List<Ingredient> inputs = new ArrayList<>();
        JsonHelper.getArray(json, "ingredients").forEach(element -> inputs.add(Ingredient.fromJson(element)));
        List<ItemStack> outputs = new ArrayList<>();
        JsonHelper.getArray(json, "results").forEach(element -> outputs.add(outputFromJson(element.getAsJsonObject())));

        int time = json.get("time").getAsInt();
        int energy = json.get("energy").getAsInt();

        return new MachineRecipe<>(rMachine, id, inputs.toArray(new Ingredient[]{}), outputs.toArray(new ItemStack[]{}), time, energy);
    }

    @Override
    public MachineRecipe<T> read(Identifier id, PacketByteBuf buf) {
        List<Ingredient> inputs = new ArrayList<>();
        for (int i = 0; i < buf.readInt(); i++) {
            inputs.add(Ingredient.fromPacket(buf));
        }
        List<ItemStack> outputs = new ArrayList<>();
        for (int i = 0; i < buf.readInt(); i++) {
            outputs.add(buf.readItemStack());
        }
        int time = buf.readInt();
        int energy = buf.readInt();
        return new MachineRecipe<>(rMachine, id, inputs.toArray(new Ingredient[]{}), outputs.toArray(new ItemStack[]{}), time, energy);
    }

    @Override
    public void write(PacketByteBuf buf, MachineRecipe<T> recipe) {
        buf.writeInt(recipe.inputs.length);
        for (Ingredient ingredient : recipe.inputs) {
            ingredient.write(buf);
        }
        buf.writeInt(recipe.outputs.length);
        for (ItemStack stack : recipe.outputs) {
            buf.writeItemStack(stack);
        }
        buf.writeInt(recipe.time);
        buf.writeInt(recipe.energy);
    }
}
