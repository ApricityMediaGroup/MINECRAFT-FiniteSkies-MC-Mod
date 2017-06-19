package finiteskies.fsmod.gui;

import java.util.Arrays;

import org.lwjgl.opengl.GL11;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.tileentity.TileEntityRedstoneGenerator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiRedstoneGenerator extends GuiContainer {

	private TileEntityRedstoneGenerator tile;
	private InventoryPlayer playerInv;
	
	public GuiRedstoneGenerator(InventoryPlayer playerInv, TileEntityRedstoneGenerator tile) {
		super(new ContainerRedstoneGenerator(playerInv, tile));
		this.xSize = 175;
		this.ySize = 166;
		this.tile = tile;
		this.playerInv =  playerInv;
	}

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.pushAttrib();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/gui/container/redstone_generator.png"));
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        GlStateManager.popAttrib();
    }
    
	
	@Override
    protected void drawGuiContainerForegroundLayer(int mx, int my) {
        GlStateManager.pushAttrib();
        GlStateManager.color(1, 1, 1, 1);
        Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/gui/container/redstone_generator.png"));
        this.drawPowerBar(tile, mx, my);
        GlStateManager.popAttrib();
    }
	
    public void drawPowerBar(TileEntityRedstoneGenerator tile, int mx, int my) {
        GlStateManager.pushAttrib();
        int barWidth = (int) (((float) this.tile.getField(0) /  this.tile.getField(1)) * 88);
        drawTexturedModalRect(44, 60, 44, 166, barWidth, 19);
        if(mx >= guiLeft + 44 && mx <= guiLeft + 132 && my >= guiTop + 60 && my <= guiTop + 79) {
            StringBuilder builder = new StringBuilder();
            String percentage = String.format("%.2f%s", ((this.tile.getField(0) + 0.0) / this.tile.getField(1) * 100.0), "%" + " (" + this.tile.getField(0) + "RC)");
            drawHoveringText(Arrays.asList(builder.toString(), percentage), mx - guiLeft, my - guiTop);
        }
        GlStateManager.popAttrib();

        
    }

    public void drawGeneratorProgress(int x, int y, TileEntityRedstoneGenerator tile) {
        GlStateManager.pushAttrib();
       // int barHeight = (int) (((float) tile.generationTimer / tile.generationTimerDefault) * 16);
       // drawTexturedModalRect(x, y + barHeight, 176, barHeight, 16, barHeight + 16);
        GlStateManager.popAttrib();

    }

}
