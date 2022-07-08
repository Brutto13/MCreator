
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arduinomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.arduinomod.block.WorkStationBlock;
import net.mcreator.arduinomod.block.RechargerBlockBlock;
import net.mcreator.arduinomod.block.PCBcreatorBlock;
import net.mcreator.arduinomod.ArduinoModMod;

public class ArduinoModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArduinoModMod.MODID);
	public static final RegistryObject<Block> WORK_STATION = REGISTRY.register("work_station", () -> new WorkStationBlock());
	public static final RegistryObject<Block> PC_BCREATOR = REGISTRY.register("pc_bcreator", () -> new PCBcreatorBlock());
	public static final RegistryObject<Block> RECHARGER_BLOCK = REGISTRY.register("recharger_block", () -> new RechargerBlockBlock());
}
