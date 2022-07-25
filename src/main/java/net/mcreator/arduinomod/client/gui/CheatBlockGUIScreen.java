
package net.mcreator.arduinomod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.arduinomod.world.inventory.CheatBlockGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CheatBlockGUIScreen extends AbstractContainerScreen<CheatBlockGUIMenu> {
	private final static HashMap<String, Object> guistate = CheatBlockGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox input;
	EditBox output_log;

	public CheatBlockGUIScreen(CheatBlockGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 168;
		this.imageHeight = 133;
	}

	private static final ResourceLocation texture = new ResourceLocation("arduino_mod:textures/cheat_block_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		input.render(ms, mouseX, mouseY, partialTicks);
		output_log.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (input.isFocused())
			return input.keyPressed(key, b, c);
		if (output_log.isFocused())
			return output_log.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		input.tick();
		output_log.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "IN:", 20, 64, -12829636);
		this.font.draw(poseStack, "OUT:", 15, 89, -12829636);
		this.font.draw(poseStack, "cheat block", 40, 9, -12829636);
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
		input = new EditBox(this.font, this.leftPos + 39, this.topPos + 59, 120, 20, new TextComponent(""));
		guistate.put("text:input", input);
		input.setMaxLength(32767);
		this.addWidget(this.input);
		output_log = new EditBox(this.font, this.leftPos + 40, this.topPos + 85, 120, 20, new TextComponent(""));
		guistate.put("text:output_log", output_log);
		output_log.setMaxLength(32767);
		this.addWidget(this.output_log);
		this.addRenderableWidget(new Button(this.leftPos + 46, this.topPos + 28, 51, 20, new TextComponent("cheat"), e -> {
		}));
	}
}
