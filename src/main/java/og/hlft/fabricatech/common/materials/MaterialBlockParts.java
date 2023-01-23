package og.hlft.fabricatech.common.materials;

import java.util.ArrayList;

public class MaterialBlockParts {

    public static final ArrayList<MaterialBlockPart> ALL;
    public static final MaterialBlockPart BLOCK;
    public static final MaterialBlockPart ORE;

    static {
        BLOCK = new MaterialBlockPart("block");
        ORE = new MaterialBlockPart("ore");

        ALL = new ArrayList<>();
        ALL.add(BLOCK);
        ALL.add(ORE);
    }
}
