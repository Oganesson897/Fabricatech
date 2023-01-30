package og.hlft.fabricatech.common.materials;

import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.List;

import static og.hlft.fabricatech.Fabricatech.asId;

public class RMaterial {
    private final String id;

    private List<RMaterialPart> parts;
    private MapColor color;
    private String chinese;

    public RMaterial(String id) {
        this.id = id;
    }

    public RMaterial setParts(List<RMaterialPart> parts) {
        this.parts = parts;
        return this;
    }

    public RMaterial setColor(MapColor color) {
        this.color = color;
        return this;
    }

    public RMaterial setChinese(String chinese) {
        this.chinese = chinese;
        return this;
    }

    public RMaterial setParts(RMaterialPart... parts) {
        this.parts = List.of(parts);
        return this;
    }

    public List<RMaterialPart> getItemParts() {
        return parts.stream().filter((materialPart -> materialPart.getType() == RMaterialPart.PartType.ITEM)).toList();
    }

    public List<RMaterialPart> getBlockParts() {
        return parts.stream().filter((materialPart -> materialPart.getType() == RMaterialPart.PartType.BLOCK)).toList();
    }

    public String getId() {
        return id;
    }

    public String makeRID(RMaterialPart part) {
        String s = part.id();
        if (s.contains("%"))
            return s.replace("%", getId());
        return getId() + "_" + part.id();
    }

    public String makeChinese(RMaterialPart part) {
        String s = part.getChinese();
        if (s.contains("%"))
            return s.replace("%", chinese);
        return chinese + part.getChinese();
    }

    public Item getPartItem(RMaterialPart part) {
        return Registry.ITEM.get(asId(makeRID(part)));
    }

    public Block getPartBlock(RMaterialPart part) {
        return Registry.BLOCK.get(asId(makeRID(part)));
    }

    public MapColor getColor() {
        return color;
    }
}
