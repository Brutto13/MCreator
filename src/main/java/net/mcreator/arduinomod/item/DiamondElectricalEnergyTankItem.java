
package net.mcreator.arduinomod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.arduinomod.init.ArduinoModModTabs;

public class DiamondElectricalEnergyTankItem extends Item {
	public DiamondElectricalEnergyTankItem() {
		super(new Item.Properties().tab(ArduinoModModTabs.TAB_ELECTRICAL_MOD).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
