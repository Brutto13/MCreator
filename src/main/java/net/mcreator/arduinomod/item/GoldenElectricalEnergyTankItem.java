
package net.mcreator.arduinomod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.arduinomod.init.ArduinoModModTabs;

public class GoldenElectricalEnergyTankItem extends Item {
	public GoldenElectricalEnergyTankItem() {
		super(new Item.Properties().tab(ArduinoModModTabs.TAB_ELECTRICAL_MOD).durability(10).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
