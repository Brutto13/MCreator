
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arduinomod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ArduinoModModTabs {
	public static CreativeModeTab TAB_ELECTRICAL_MOD;

	public static void load() {
		TAB_ELECTRICAL_MOD = new CreativeModeTab("tabelectrical_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.KNOWLEDGE_BOOK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
