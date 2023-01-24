package og.hlft.fabricatech.datagen;

import net.minecraft.data.DataGenerator;
import og.hlft.fabricatech.common.materials.RMaterials;

public class RI18NPProvider {
    public static class EnUs extends RLangProvider {
        public EnUs(DataGenerator generator) {
            super(generator, "en_us");
        }
        @Override
        protected void init() {
            add(RMaterials.TIN);
            add(RMaterials.LEAD);
            add(RMaterials.NICKEL);
            add(RMaterials.SILVER);
        }
    }

}
