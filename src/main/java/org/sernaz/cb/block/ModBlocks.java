package org.sernaz.cb.block;

import org.sernaz.cb.CommandBlocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CCOMMAND_BLOCK = register(new Block(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).requiresTool().strength(-1.0F, 3600000.0F).dropsNothing()), "ccommand_block", true);
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
		Identifier id = new Identifier(CommandBlocks.MOD_ID, name);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

    public static void initialize() {}
}
