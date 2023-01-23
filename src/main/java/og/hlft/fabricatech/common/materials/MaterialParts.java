package og.hlft.fabricatech.common.materials;

import java.util.ArrayList;

public class MaterialParts {
    public static final MaterialPart INGOT;
    public static final MaterialPart PLATE;
    public static final MaterialPart GEAR;
    public static final MaterialPart DUST;
    public static final MaterialPart ROD;
    public static final MaterialPart NUGGET;
    public static final MaterialPart RAW_ORE;
    public static final ArrayList<MaterialPart> ALL;

    static {
        INGOT = new MaterialPart("ingot");
        PLATE = new MaterialPart("plate");
        GEAR = new MaterialPart("gear");
        DUST = new MaterialPart("dust");
        ROD = new MaterialPart("rod");
        NUGGET = new MaterialPart("nugget");
        RAW_ORE = new MaterialPart("raw");

        ALL = new ArrayList<>();
        ALL.add(INGOT);
        ALL.add(PLATE);
        ALL.add(GEAR);
        ALL.add(DUST);
        ALL.add(ROD);
        ALL.add(NUGGET);
        ALL.add(RAW_ORE);
    }
}
