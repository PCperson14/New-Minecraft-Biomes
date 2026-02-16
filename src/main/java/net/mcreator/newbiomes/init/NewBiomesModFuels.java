/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newbiomes.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class NewBiomesModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == NewBiomesModBlocks.PALMBIOMELOG.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == NewBiomesModBlocks.PALMBIOMEPLANKS.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == NewBiomesModBlocks.PALMBIOMESLAB.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == NewBiomesModBlocks.PALMBIOMEFENCE.get().asItem())
			event.setBurnTime(1600);
	}
}