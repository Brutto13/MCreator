package net.mcreator.arduinomod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.arduinomod.init.ArduinoModModItems;

import java.util.HashMap;

public class CheatBlockProcedureProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:input") ? ((EditBox) guistate.get("text:input")).getValue() : "").equals("give iron")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((guistate.containsKey("text:input") ? ((EditBox) guistate.get("text:input")).getValue() : "").equals("give me iron armor")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.IRON_HELMET);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.IRON_CHESTPLATE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.IRON_LEGGINGS);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.IRON_BOOTS);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (guistate.get("text:output") instanceof EditBox _tf)
				_tf.setValue("gave: iron helmet, chestplate, leggins, boots");
		} else if ((guistate.containsKey("text:input") ? ((EditBox) guistate.get("text:input")).getValue() : "").equals("PCB master")) {
			if (guistate.get("text:output") instanceof EditBox _tf)
				_tf.setValue("gave ready PCB");
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ArduinoModModItems.READY_PCB.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (guistate.get("text:output") instanceof EditBox _tf)
				_tf.setValue("ERROR: command not in list");
		}
	}
}
