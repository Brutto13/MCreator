
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arduinomod.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.arduinomod.world.inventory.WorkstationGUIMenu;
import net.mcreator.arduinomod.world.inventory.SchematicsTableGUIMenu;
import net.mcreator.arduinomod.world.inventory.RechargerGUIMenu;
import net.mcreator.arduinomod.world.inventory.ProjectTableGUIMenu;
import net.mcreator.arduinomod.world.inventory.PCBCreatorGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArduinoModModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<PCBCreatorGUIMenu> PCB_CREATOR_GUI = register("pcb_creator_gui",
			(id, inv, extraData) -> new PCBCreatorGUIMenu(id, inv, extraData));
	public static final MenuType<WorkstationGUIMenu> WORKSTATION_GUI = register("workstation_gui",
			(id, inv, extraData) -> new WorkstationGUIMenu(id, inv, extraData));
	public static final MenuType<ProjectTableGUIMenu> PROJECT_TABLE_GUI = register("project_table_gui",
			(id, inv, extraData) -> new ProjectTableGUIMenu(id, inv, extraData));
	public static final MenuType<SchematicsTableGUIMenu> SCHEMATICS_TABLE_GUI = register("schematics_table_gui",
			(id, inv, extraData) -> new SchematicsTableGUIMenu(id, inv, extraData));
	public static final MenuType<RechargerGUIMenu> RECHARGER_GUI = register("recharger_gui",
			(id, inv, extraData) -> new RechargerGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
