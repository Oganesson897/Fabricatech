package og.hlft.yjn.fabricatech.init;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.registry.Registry;
import og.hlft.yjn.fabricatech.common.machines.RMachine;

import static og.hlft.yjn.fabricatech.Fabricatech.asId;


public class RecipeRegistry {
    public static void register() {
        machine(RMachines.ALLOYING_FURNACE);
    }

    private static void machine(RMachine machine) {
        Registry.register(Registry.RECIPE_TYPE, asId(machine.recipeID), machine.getRecipeType());
        Registry.register(Registry.RECIPE_SERIALIZER, asId(machine.recipeID), machine.getRecipeSerializer());
    }

    public static RecipeType<?> getRecipeType(String id) {
        return Registry.RECIPE_TYPE.get(asId(id));
    }

    public static RecipeSerializer<?> getRecipeSerializer(String id) {
        return Registry.RECIPE_SERIALIZER.get(asId(id));
    }
}
