package og.hlft.fabricatech.api.materials;

public class MaterialParts {
    public static final MaterialPart INGOT;
    public static final MaterialPart PLATE;
    public static final MaterialPart GEAR;
    public static final MaterialPart DUST;
    public static final MaterialPart ROD;
    public static final MaterialPart NUGGET;
    public static final MaterialPart RAW_ORE;

    static {
        INGOT = new MaterialPart("ingot");
        PLATE = new MaterialPart("plate");
        GEAR = new MaterialPart("gear");
        DUST = new MaterialPart("dust");
        ROD = new MaterialPart("rod");
        NUGGET = new MaterialPart("nugget");
        RAW_ORE = new MaterialPart("raw");
    }
}
