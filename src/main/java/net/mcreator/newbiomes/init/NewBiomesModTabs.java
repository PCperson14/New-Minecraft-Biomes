/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.newbiomes.NewBiomesMod;

@EventBusSubscriber
public class NewBiomesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewBiomesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NewBiomesModBlocks.PALMBIOMELOG.get().asItem());
			tabData.accept(NewBiomesModBlocks.PALMBIOMELEAVES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NewBiomesModBlocks.PALMBIOMELOG.get().asItem());
			tabData.accept(NewBiomesModBlocks.PALMBIOMEPLANKS.get().asItem());
			tabData.accept(NewBiomesModBlocks.PALMBIOMESLAB.get().asItem());
			tabData.accept(NewBiomesModBlocks.PALMBIOMEFENCE.get().asItem());
			tabData.accept(NewBiomesModBlocks.PALM_WOOD.get().asItem());
		}
	}
}