package og.hlft.fabricatech.api.datagen;

import net.minecraft.block.Block;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import og.hlft.fabricatech.Fabricatech;
import og.hlft.fabricatech.init.BlockRegistry;

public class DatagenUtil {

    private String id;
    private Block block;
    private Item item;
    public DatagenUtil(String id) {
        this.id = id;
        this.block = BlockRegistry.getBlock(id);
        this.item = this.block.asItem();
    }

    public Identifier getId() {
        return Fabricatech.asId(id);
    }

    public LootTable.Builder getBuild() {
        return BlockLootTableGenerator.drops(this.block, this.item, ConstantLootNumberProvider.create(1.0f));
    }
}
