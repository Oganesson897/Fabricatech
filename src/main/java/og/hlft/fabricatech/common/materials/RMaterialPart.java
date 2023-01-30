package og.hlft.fabricatech.common.materials;

public enum RMaterialPart {
    INGOT(PartType.ITEM, "锭"),
    RAW_ORE(PartType.ITEM, "粗%", "raw_%"),
    NUGGET(PartType.ITEM, "粒"),
    BLOCK(PartType.BLOCK, "块"),
    RAW_BLOCK(PartType.BLOCK, "粗%块", "raw_%_block"),
    ORE(PartType.BLOCK, "矿石"),
    DEEPSLATE_ORE(PartType.BLOCK, "深层%矿石", "deepslate_%_ore"),

    PLATE(PartType.ITEM, "板"),
    GEAR(PartType.ITEM, "齿轮"),
    DUST(PartType.ITEM, "粉"),
    ROD(PartType.ITEM, "杆");

    private final PartType type;
    private final String chinese;
    private String fixName = null;

    RMaterialPart(PartType type, String chinese) {
        this.type = type;
        this.chinese = chinese;
    }

    RMaterialPart(PartType type, String chinese, String fixName) {
        this.type = type;
        this.chinese = chinese;
        this.fixName = fixName;
    }

    public PartType getType() {
        return type;
    }

    public String getChinese() {
        return chinese;
    }

    public static RMaterialPart[] vanilla() {
        return new RMaterialPart[] { PLATE, GEAR, DUST, ROD };
    }

    public String id() {
        if (fixName != null)
            return fixName;
        return name().toLowerCase();
    }

    public enum PartType {
        BLOCK,
        ITEM
    }
}
