package net.mcreator.arduinomod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.arduinomod.init.ArduinoModModItems;

import java.util.Random;

public class LaserRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(ArduinoModModItems.ELECTRICAL_ENERGY_TANK.get()))
				: false) {
			{
				ItemStack _ist = new ItemStack(ArduinoModModItems.ELECTRICAL_ENERGY_TANK.get());
				if (_ist.hurt(4, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(ArduinoModModItems.GOLDEN_ELECTRICAL_ENERGY_TANK.get()))
				: false) {
			{
				ItemStack _ist = new ItemStack(ArduinoModModItems.GOLDEN_ELECTRICAL_ENERGY_TANK.get());
				if (_ist.hurt(5, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(ArduinoModModItems.DIAMOND_ELECTRICAL_ENERGY_TANK.get()))
				: false) {
			{
				ItemStack _ist = new ItemStack(ArduinoModModItems.DIAMOND_ELECTRICAL_ENERGY_TANK.get());
				if (_ist.hurt(5, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
