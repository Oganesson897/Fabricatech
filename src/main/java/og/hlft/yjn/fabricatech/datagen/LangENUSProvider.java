package og.hlft.yjn.fabricatech.datagen;

import net.minecraft.data.DataGenerator;
import og.hlft.yjn.fabricatech.Fabricatech;
import og.hlft.yjn.fabricatech.init.RMaterials;

public class LangENUSProvider extends RLangProvider {
    public LangENUSProvider(DataGenerator generator) {
        super(generator, "en_us");
    }

    @Override
    protected void init() {
        add(Fabricatech.TAB, "Fabricatech");
        add(Fabricatech.MATERIALS_TAB, "Fabricatech | Material");

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
