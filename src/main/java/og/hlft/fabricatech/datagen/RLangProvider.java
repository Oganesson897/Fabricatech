package og.hlft.fabricatech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import og.hlft.fabricatech.common.materials.RMaterial;
import og.hlft.fabricatech.common.materials.RMaterialPart;
import og.hlft.fabricatech.init.ItemRegistry;

import static og.hlft.fabricatech.Fabricatech.MOD_ID;;

public abstract class RLangProvider extends FabricLanguageProvider {

    protected RLangProvider(FabricDataOutput dataOutput, String languageCode) {
        super(dataOutput, languageCode);
    }

    public static String beautifyName(String name) {
        String[] str1 = name.split("_");
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str1.length; i++) {
            str1[i] = str1[i].substring(0, 1).toUpperCase() + str1[i].substring(1);
            if (i == str1.length - 1)
                str2.append(str1[i]);
            else
                str2.append(str1[i]).append(" ");
        }
        return str2.toString();
    }

    protected void add(TranslationBuilder builder, RMaterial material) {
        for (RMaterialPart part : material.getItemParts()) {
            builder.add("item." + MOD_ID + "." + material.makeRID(part), beautifyName(material.makeRID(part)));
        }

        for (RMaterialPart part : material.getBlockParts()) {
            builder.add("block." + MOD_ID + "." + material.makeRID(part), beautifyName(material.makeRID(part)));
        }
    }

    protected void item(TranslationBuilder builder, String id) {
        builder.add(ItemRegistry.getItem(id).getTranslationKey(), beautifyName(id));
    }

    protected void item(TranslationBuilder builder, String id, String name) {
        builder.add(ItemRegistry.getItem(id).getTranslationKey(), name);
    }

    protected void tip(TranslationBuilder builder, String path, String tip) {
        builder.add("tip." + MOD_ID + "." + path, tip);
    }

}
