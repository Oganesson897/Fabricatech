package og.hlft.fabricatech.api.materials;

public class MaterialBlockParts {
    public static final MaterialBlockPart BLOCK;
    public static final MaterialBlockPart ORE;

    static {
        BLOCK = new MaterialBlockPart("block");
        ORE = new MaterialBlockPart("ore");
    }
}
