package finiteskies.fsmod.render;

import finiteskies.fsmod.entity.EntityMusketBullet;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityMusketBulletRenderFactory implements IRenderFactory<EntityMusketBullet> {
	 @Override
	 public Render<? super EntityMusketBullet> createRenderFor(RenderManager manager)
	    {
	        return new RenderEntityMusketBullet(manager);
	    }
}
