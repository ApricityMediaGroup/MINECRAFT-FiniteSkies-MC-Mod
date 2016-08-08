package finiteskies.fsmod.render;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.entity.EntityFish;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityFish extends RenderLiving {

	private static final ResourceLocation EntityFishTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/fish.png");

	public RenderEntityFish(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	protected ResourceLocation getEntityTexture(EntityFish entity)
    {
        return EntityFishTextures;
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityFish)entity);
	}
    
}