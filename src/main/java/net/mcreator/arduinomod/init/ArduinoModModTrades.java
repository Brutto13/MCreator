
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.arduinomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ArduinoModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.COPPER_BLOCK), new ItemStack(Items.EMERALD),
					new ItemStack(ArduinoModModItems.COPPER_SHEET.get(), 3), 10, 15, 0.05f));
			trades.get(2).add(new BasicItemListing(new ItemStack(ArduinoModModItems.CHEMICALS.get()), new ItemStack(Items.EMERALD),
					new ItemStack(ArduinoModModItems.PERNAMENT_MARKER.get()), 10, 5, 0.05f));
			trades.get(3).add(new BasicItemListing(new ItemStack(ArduinoModModItems.COPPER_SHEET.get()),
					new ItemStack(ArduinoModModItems.PC_BPROJECT.get()), new ItemStack(ArduinoModModItems.MARKED_COPPER_SHEET.get()), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(ArduinoModModItems.MARKED_COPPER_SHEET.get()),
					new ItemStack(ArduinoModModItems.CHEMICALS.get()), new ItemStack(ArduinoModModItems.READY_PCB.get()), 10, 5, 0.05f));
			trades.get(5)
					.add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 25),
							new ItemStack(ArduinoModModItems.DIAMOND_ELECTRICAL_ENERGY_TANK.get()),
							new ItemStack(ArduinoModModBlocks.IRON_GENERATOR_BLOCK.get()), 2, 1000, 0.05f));
		}
	}
}
