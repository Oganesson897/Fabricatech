package og.hlft.fabricatech.common.items.base;

import org.jetbrains.annotations.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.common.itemgroups.ItemGroupContent;

public class BaseMaterialItem extends Item implements ItemGroupContent {

    public BaseMaterialItem(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable ItemGroup getItemGroup() {
        return Fabricatech.MATERIALS_TAB;
    }

}
