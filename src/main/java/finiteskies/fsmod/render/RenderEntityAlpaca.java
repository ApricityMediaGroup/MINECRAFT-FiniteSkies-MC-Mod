package finiteskies.fsmod.render;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.entity.EntityAlpaca;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityAlpaca extends RenderLiving {

	private static final ResourceLocation EntityAlpacaTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/alpaca.png");

	public RenderEntityAlpaca(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	protected ResourceLocation getEntityTexture(EntityAlpaca entity)
    {
        return EntityAlpacaTextures;
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityAlpaca)entity);
	}
    
}