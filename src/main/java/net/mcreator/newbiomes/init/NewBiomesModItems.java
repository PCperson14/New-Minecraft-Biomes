/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.newbiomes.NewBiomesMod;

import java.util.function.Function;

public class NewBiomesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(NewBiomesMod.MODID);
	public static final DeferredItem<Item> PALMBIOMELOG;
	public static final DeferredItem<Item> PALMBIOMELEAVES;
	public static final DeferredItem<Item> PALMBIOMEPLANKS;
	public static final DeferredItem<Item> PALMBIOMESLAB;
	public static final DeferredItem<Item> PALMBIOMEFENCE;
	public static final DeferredItem<Item> PALM_WOOD;
	static {
		PALMBIOMELOG = block(NewBiomesModBlocks.PALMBIOMELOG);
		PALMBIOMELEAVES = block(NewBiomesModBlocks.PALMBIOMELEAVES);
		PALMBIOMEPLANKS = block(NewBiomesModBlocks.PALMBIOMEPLANKS);
		PALMBIOMESLAB = block(NewBiomesModBlocks.PALMBIOMESLAB);
		PALMBIOMEFENCE = block(NewBiomesModBlocks.PALMBIOMEFENCE);
		PALM_WOOD = block(NewBiomesModBlocks.PALM_WOOD);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}