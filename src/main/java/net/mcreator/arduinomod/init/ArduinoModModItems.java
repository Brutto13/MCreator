
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arduinomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.arduinomod.item.SchematicItem;
import net.mcreator.arduinomod.item.ReadyPCBItem;
import net.mcreator.arduinomod.item.PernamentMarkerItem;
import net.mcreator.arduinomod.item.PCBprojectItem;
import net.mcreator.arduinomod.item.MarkedCopperSheetItem;
import net.mcreator.arduinomod.item.ElectricalEnergyTankItem;
import net.mcreator.arduinomod.item.ElectricalEnergyItem;
import net.mcreator.arduinomod.item.CopperSheetItem;
import net.mcreator.arduinomod.item.ChemicalsItem;
import net.mcreator.arduinomod.ArduinoModMod;

public class ArduinoModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArduinoModMod.MODID);
	public static final RegistryObject<Item> COPPER_SHEET = REGISTRY.register("copper_sheet", () -> new CopperSheetItem());
	public static final RegistryObject<Item> PERNAMENT_MARKER = REGISTRY.register("pernament_marker", () -> new PernamentMarkerItem());
	public static final RegistryObject<Item> CHEMICALS = REGISTRY.register("chemicals", () -> new ChemicalsItem());
	public static final RegistryObject<Item> PC_BPROJECT = REGISTRY.register("pc_bproject", () -> new PCBprojectItem());
	public static final RegistryObject<Item> MARKED_COPPER_SHEET = REGISTRY.register("marked_copper_sheet", () -> new MarkedCopperSheetItem());
	public static final RegistryObject<Item> WORK_STATION = block(ArduinoModModBlocks.WORK_STATION, ArduinoModModTabs.TAB_ELECTRICAL_MOD);
	public static final RegistryObject<Item> PC_BCREATOR = block(ArduinoModModBlocks.PC_BCREATOR, ArduinoModModTabs.TAB_ELECTRICAL_MOD);
	public static final RegistryObject<Item> ELECTRICAL_ENERGY = REGISTRY.register("electrical_energy", () -> new ElectricalEnergyItem());
	public static final RegistryObject<Item> ELECTRICAL_ENERGY_TANK = REGISTRY.register("electrical_energy_tank",
			() -> new ElectricalEnergyTankItem());
	public static final RegistryObject<Item> SCHEMATIC = REGISTRY.register("schematic", () -> new SchematicItem());
	public static final RegistryObject<Item> READY_PCB = REGISTRY.register("ready_pcb", () -> new ReadyPCBItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
