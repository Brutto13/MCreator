
package net.mcreator.arduinomod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.arduinomod.world.inventory.IronGeneratorGUIMenu;
import net.mcreator.arduinomod.network.IronGeneratorGUIButtonMessage;
import net.mcreator.arduinomod.ArduinoModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class IronGeneratorGUIScreen extends AbstractContainerScreen<IronGeneratorGUIMenu> {
	private final static HashMap<String, Object> guistate = IronGeneratorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public IronGeneratorGUIScreen(IronGeneratorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("arduino_mod:textures/iron_generator_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("arduino_mod:textures/upgradetableiconplus.png"));
		this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 13, 13, 13, 13);

		RenderSystem.setShaderTexture(0, new ResourceLocation("arduino_mod:textures/upgradetableiconinto.png"));
		this.blit(ms, this.leftPos + 86, this.topPos + 33, 0, 0, 22, 15, 22, 15);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 57, this.topPos + 8, 51, 20, new TextComponent("START"), e -> {
			if (true) {
				ArduinoModMod.PACKET_HANDLER.sendToServer(new IronGeneratorGUIButtonMessage(0, x, y, z));
				IronGeneratorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
