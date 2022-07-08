package net.mcreator.arduinomod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.arduinomod.init.ArduinoModModItems;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class RechargingprocedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (ArduinoModModItems.ELECTRICAL_BATERRY
				.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& (ArduinoModModItems.ELECTRICAL_ENERGY_TANK
						.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()
						|| ArduinoModModItems.GOLDEN_ELECTRICAL_ENERGY_TANK
								.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()
						|| ArduinoModModItems.DIAMOND_ELECTRICAL_ENERGY_TANK
								.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem())) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack stack = ((Slot) _slots.get(0)).getItem();
				if (stack != null) {
					if (stack.hurt(1, new Random(), null)) {
						stack.shrink(1);
						stack.setDamageValue(0);
					}
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack stack = ((Slot) _slots.get(1)).getItem();
				if (stack != null) {
					if (stack.hurt(-1, new Random(), null)) {
						stack.shrink(1);
						stack.setDamageValue(0);
					}
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
