/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.newbiomes.block.*;
import net.mcreator.newbiomes.NewBiomesMod;

import java.util.function.Function;

public class NewBiomesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(NewBiomesMod.MODID);
	public static final DeferredBlock<Block> PALMBIOMELOG;
	public static final DeferredBlock<Block> PALMBIOMELEAVES;
	public static final DeferredBlock<Block> PALMBIOMEPLANKS;
	public static final DeferredBlock<Block> PALMBIOMESLAB;
	public static final DeferredBlock<Block> PALMBIOMEFENCE;
	public static final DeferredBlock<Block> PALM_WOOD;
	static {
		PALMBIOMELOG = register("palmbiomelog", PalmbiomelogBlock::new);
		PALMBIOMELEAVES = register("palmbiomeleaves", PalmbiomeleavesBlock::new);
		PALMBIOMEPLANKS = register("palmbiomeplanks", PalmbiomeplanksBlock::new);
		PALMBIOMESLAB = register("palmbiomeslab", PalmbiomeslabBlock::new);
		PALMBIOMEFENCE = register("palmbiomefence", PalmbiomefenceBlock::new);
		PALM_WOOD = register("palm_wood", PalmWoodBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}