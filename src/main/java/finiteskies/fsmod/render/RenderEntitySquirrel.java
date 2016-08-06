package finiteskies.fsmod.render;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.entity.EntitySquirrel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntitySquirrel extends RenderLiving {

	private static final ResourceLocation EntitySquirrelTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/squirrel.png");

	public RenderEntitySquirrel(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	protected ResourceLocation getEntityTexture(EntitySquirrel entity)
    {
        return EntitySquirrelTextures;
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntitySquirrel)entity);
	}
    
}