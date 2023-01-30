package og.hlft.yjn.fabricatech.common.machines.multiblocks;

import net.minecraft.block.Block;

import java.util.Map;

public class MultiblockBuilder {
    public static MultiblockBuilder BUILDER;

    private static String id;
    private static Block controller;

    private int height;
    private int width;
    private int length;

    private static String[][][] multiblockStructures;

    private static Map<String, Block> blocks;

    public MultiblockBuilder(String id, Block controller, int height, int width, int length) {
        this.id = id;
        this.controller = controller;
        this.height = height;
        this.width = width;
        this.length = length;
        this.multiblockStructures = new String[length][width][height];
        this.BUILDER = new MultiblockBuilder(id, controller, height, width, length);
    }

    public MultiblockBuilder setStructure(String[][][] structures) {
        this.multiblockStructures = structures;
        return this;
    }

    public MultiblockBuilder setBlockList(Map<String, Block> blocks) {
        this.blocks = blocks;
        return this;
    }


}
