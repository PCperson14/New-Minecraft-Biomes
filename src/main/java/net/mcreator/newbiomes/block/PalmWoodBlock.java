package net.mcreator.newbiomes.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PalmWoodBlock extends Block {
	public PalmWoodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(2.45f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}