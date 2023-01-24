package og.hlft.fabricatech.datagen;

import net.minecraft.data.DataGenerator;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.materials.RMaterials;

public class LangENUSProvider extends RLangProvider {
    public LangENUSProvider(DataGenerator generator) {
        super(generator, "en_us");
    }

    @Override
    protected void init() {
        add(Fabricatech.TAB, "Fabricatech");

        item("battery");

        tip("energy", "Energy: ");

        add(RMaterials.TIN);
        add(RMaterials.LEAD);
        add(RMaterials.NICKEL);
        add(RMaterials.SILVER);

        add(RMaterials.IRON);
        add(RMaterials.GOLD);
        add(RMaterials.COPPER);
    }
}
