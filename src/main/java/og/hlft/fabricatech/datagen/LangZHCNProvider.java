package og.hlft.fabricatech.datagen;

import net.minecraft.data.DataGenerator;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.init.RMaterials;

import static og.hlft.fabricatech.Fabricatech.MOD_ID;

public class LangZHCNProvider extends RLangProvider {
    public LangZHCNProvider(DataGenerator generator) {
        super(generator, "zh_cn");
    }

    @Override
    protected void init() {
        add(Fabricatech.TAB, "法克法克法克");
        add(Fabricatech.MATERIALS_TAB, "法克法克法克 | 材料");

        item("battery", "电池");

        tip("energy", "能量: ");

        add(RMaterials.TIN);
        add(RMaterials.LEAD);
        add(RMaterials.NICKEL);
        add(RMaterials.SILVER);

        add(RMaterials.IRON);
        add(RMaterials.GOLD);
        add(RMaterials.COPPER);
    }

    @Override
    protected void add(RMaterial material) {
        for (RMaterialPart part : material.getItemParts()) {
            map.put("item."+ MOD_ID + "." + material.makeRID(part), material.makeChinese(part));
        }

        for (RMaterialPart part : material.getBlockParts()) {
            map.put("block."+ MOD_ID + "." + material.makeRID(part), material.makeChinese(part));
        }
    }
}
