package og.hlft.fabricatech.common.materials;

public enum RMaterialPart {
    INGOT(PartType.ITEM),
    RAW_ORE(PartType.ITEM),
    NUGGET(PartType.ITEM),
    BLOCK(PartType.BLOCK),
    RAW_BLOCK(PartType.BLOCK),
    ORE(PartType.BLOCK),

    PLATE(PartType.ITEM),
    GEAR(PartType.ITEM),
    DUST(PartType.ITEM),
    ROD(PartType.ITEM);

    private final PartType type;

    RMaterialPart(PartType type) {
        this.type = type;
    }

    public PartType getType() {
        return type;
    }

    public static RMaterialPart[] vanilla() {
        return new RMaterialPart[]{PLATE, GEAR, DUST, ROD};
    }

    public enum PartType {
        BLOCK,
        ITEM
    }
}
