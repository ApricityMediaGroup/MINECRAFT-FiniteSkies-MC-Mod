package finiteskies.fsmod.tileentity.render;

import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.tileentity.JarTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;

public class JarRenderer extends TileEntitySpecialRenderer<JarTileEntity> {
	
	private static final EntityItem ITEM = new EntityItem(Minecraft.getMinecraft().world, 0, 0, 0, new ItemStack(ModItems.strawberry));
	
	@Override
	public void renderTileEntityFast(JarTileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float partial, BufferBuilder buffer) {
		super.renderTileEntityFast(te, x, y, z, partialTicks, destroyStage, partial, buffer);
																			// y
		Minecraft.getMinecraft().getRenderManager().doRenderEntity(ITEM, x, y, z, 0F, partialTicks, false);
	}
	
}
