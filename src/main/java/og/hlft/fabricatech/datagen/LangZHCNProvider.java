package og.hlft.fabricatech.datagen;

import static og.hlft.fabricatech.Fabricatech.MOD_ID;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.init.RMaterials;

public class LangZHCNProvider extends RLangProvider {
    public LangZHCNProvider(FabricDataOutput generator) {
        super(generator, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(Fabricatech.TAB, "法克法克法克");
        builder.add(Fabricatech.MATERIALS_TAB, "法克法克法克 | 材料");

        item(builder, "battery", "电池");

        tip(builder, "energy", "能量: ");

        add(builder, RMaterials.TIN);
        add(builder, RMaterials.LEAD);
        add(builder, RMaterials.NICKEL);
        add(builder, RMaterials.SILVER);

        add(builder, RMaterials.IRON);
        add(builder, RMaterials.GOLD);
        add(builder, RMaterials.COPPER);
    }

    @Override
    protected void add(TranslationBuilder builder, RMaterial material) {
        for (RMaterialPart part : material.getItemParts()) {
            builder.add("item." + MOD_ID + "." + material.makeRID(part), material.makeChinese(part));
        }

        for (RMaterialPart part : material.getBlockParts()) {
            builder.add("block." + MOD_ID + "." + material.makeRID(part), material.makeChinese(part));
        }
    }
}
