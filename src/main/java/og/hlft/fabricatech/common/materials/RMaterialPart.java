package og.hlft.fabricatech.common.materials;

public enum RMaterialPart {
    INGOT(PartType.ITEM, "锭"),
    RAW_ORE(PartType.ITEM, "粗%"),
    NUGGET(PartType.ITEM, "粒"),
    BLOCK(PartType.BLOCK, "块"),
    RAW_BLOCK(PartType.BLOCK, "粗%块"),
    ORE(PartType.BLOCK, "矿石"),
    DEEPSLATE_ORE(PartType.BLOCK, "深层%矿石"),

    PLATE(PartType.ITEM, "板"),
    GEAR(PartType.ITEM, "齿轮"),
    DUST(PartType.ITEM, "粉"),
    ROD(PartType.ITEM, "杆");

    private final PartType type;
    private final String chinese;

    RMaterialPart(PartType type, String chinese) {
        this.type = type;
        this.chinese = chinese;
    }

    public PartType getType() {
        return type;
    }

    public String getChinese() {
        return chinese;
    }

    public static RMaterialPart[] vanilla() {
        return new RMaterialPart[]{PLATE, GEAR, DUST, ROD};
    }

    public String id() {
        return name().toLowerCase();
    }

    public enum PartType {
        BLOCK,
        ITEM
    }
}
