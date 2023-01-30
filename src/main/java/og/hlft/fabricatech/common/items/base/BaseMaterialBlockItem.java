package og.hlft.fabricatech.common.items.base;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.itemgroups.ItemGroupContent;

public class BaseMaterialBlockItem extends BlockItem implements ItemGroupContent {

    public BaseMaterialBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public @Nullable ItemGroup getItemGroup() {
        return Fabricatech.MATERIALS_TAB;
    }

}
