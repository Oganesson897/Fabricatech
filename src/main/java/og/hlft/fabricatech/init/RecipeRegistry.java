package og.hlft.fabricatech.init;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.registry.Registry;
import og.hlft.fabricatech.common.machines.RMachine;

import static og.hlft.fabricatech.Fabricatech.asId;


public class RecipeRegistry {
    public static void register() {
        machine(RMachines.ALLOYING_FURNACE);
    }

    private static void machine(RMachine machine) {
        recipe(machine.getRecipeSerializer(), machine.getRecipeType(), machine.recipeID);
    }

    private static void recipe(RecipeSerializer<?> serializer, RecipeType<?> type, String id) {
        Registry.register(Registry.RECIPE_TYPE, asId(id), type);
        Registry.register(Registry.RECIPE_SERIALIZER, asId(id), serializer);
    }

    public static RecipeType<?> getRecipeType(String id) {
        return Registry.RECIPE_TYPE.get(asId(id));
    }

    public static RecipeSerializer<?> getRecipeSerializer(String id) {
        return Registry.RECIPE_SERIALIZER.get(asId(id));
    }
}
