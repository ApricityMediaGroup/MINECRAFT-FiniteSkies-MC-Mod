package finiteskies.fsmod.render;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.entity.EntityLlama;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityLlama extends RenderLiving {

	private static final ResourceLocation EntityLlamaTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/llama.png");

	public RenderEntityLlama(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	protected ResourceLocation getEntityTexture(EntityLlama entity)
    {
        return EntityLlamaTextures;
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityLlama)entity);
	}
    
}