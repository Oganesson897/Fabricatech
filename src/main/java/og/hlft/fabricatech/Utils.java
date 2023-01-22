package og.hlft.fabricatech;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {
    public static final String MODID = "fabricatech";

    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public static ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MODID, "items"),
            () -> new ItemStack(Items.DIAMOND));
    public static Identifier asId(String path) {
        return new Identifier(MODID, path);
    }
}
