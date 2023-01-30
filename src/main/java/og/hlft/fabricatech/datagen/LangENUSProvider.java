package og.hlft.fabricatech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.init.RMaterials;

public class LangENUSProvider extends RLangProvider {

    public LangENUSProvider(FabricDataOutput generator) {
        super(generator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(Fabricatech.TAB, "Fabricatech");
        builder.add(Fabricatech.MATERIALS_TAB, "Fabricatech | Material");

        item(builder, "battery");

        tip(builder, "energy", "Energy: ");

        add(builder, RMaterials.TIN);
        add(builder, RMaterials.LEAD);
        add(builder, RMaterials.NICKEL);
        add(builder, RMaterials.SILVER);

        add(builder, RMaterials.IRON);
        add(builder, RMaterials.GOLD);
        add(builder, RMaterials.COPPER);
    }

}
