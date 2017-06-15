package finiteskies.fsmod.render;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.items.weapons.EntityMusketBullet;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityMusketBullet extends Render {

	private static final ResourceLocation EntityMusketBulletTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/musket_bullet.png");

	public RenderEntityMusketBullet(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn);
	}

	protected ResourceLocation getEntityTexture(EntityMusketBullet entity)
    {
        return EntityMusketBulletTextures;
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityMusketBullet)entity);
	}
    
}