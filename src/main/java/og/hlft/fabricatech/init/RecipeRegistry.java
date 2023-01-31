package og.hlft.fabricatech.init;

import static og.hlft.fabricatech.Fabricatech.asId;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import og.hlft.fabricatech.common.machines.RMachine;


public class RecipeRegistry {
    public static void register() {
        machine(RMachines.ALLOYING_FURNACE);
        machine(RMachines.MACERATOR);
        machine(RMachines.ARC_FURNACE);
        machine(RMachines.CENTRIFUGE);
        machine(RMachines.CIRCUIT_ETCHER);
        machine(RMachines.COMPRESSOR);
        machine(RMachines.MIXER);
    }

    private static void machine(RMachine machine) {
        Registry.register(Registries.RECIPE_TYPE, asId(machine.recipeID), machine.getRecipeType());
        Registry.register(Registries.RECIPE_SERIALIZER, asId(machine.recipeID), machine.getRecipeSerializer());
    }

    public static RecipeType<?> getRecipeType(String id) {
        return Registries.RECIPE_TYPE.get(asId(id));
    }

    public static RecipeSerializer<?> getRecipeSerializer(String id) {
        return Registries.RECIPE_SERIALIZER.get(asId(id));
    }
}
