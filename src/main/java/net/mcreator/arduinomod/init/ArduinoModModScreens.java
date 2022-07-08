
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arduinomod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.arduinomod.client.gui.WorkstationGUIScreen;
import net.mcreator.arduinomod.client.gui.SchematicsTableGUIScreen;
import net.mcreator.arduinomod.client.gui.ProjectTableGUIScreen;
import net.mcreator.arduinomod.client.gui.PCBCreatorGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArduinoModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ArduinoModModMenus.PCB_CREATOR_GUI, PCBCreatorGUIScreen::new);
			MenuScreens.register(ArduinoModModMenus.WORKSTATION_GUI, WorkstationGUIScreen::new);
			MenuScreens.register(ArduinoModModMenus.PROJECT_TABLE_GUI, ProjectTableGUIScreen::new);
			MenuScreens.register(ArduinoModModMenus.SCHEMATICS_TABLE_GUI, SchematicsTableGUIScreen::new);
		});
	}
}
