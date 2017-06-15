package finiteskies.fsmod.entity;

import java.util.BitSet;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.entity.EntitySquirrel;
import finiteskies.fsmod.entity.EntityFish;
import net.minecraft.entity.EntityList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	private static final ModEntities INSTANCE = new ModEntities();
	private BitSet availableIndicies;
	
	public static ModEntities instance() {
		return INSTANCE;
	}
/*
	private ModEntities() {
		availableIndicies = new BitSet(256);
		availableIndicies.set(1, 255);
		for (Object id : EntityList.) {
			availableIndicies.clear((Integer)id);
		}
	}
	
	public static int findGlobalUniqueEntityId() {
		int res = instance().availableIndicies.nextSetBit(0);
		if (res < 0) {
			throw new RuntimeException("No more entity indicies left");
		}
		return res;
	}   
*/
	
//	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
//		int randomId = findGlobalUniqueEntityId();
//		EntityRegistry.registerModEntity(entityClass, entityName, randomId, FSMod.instance, 64, 1, true, solidColor, spotColor);
//	}
	private static final ResourceLocation EntitySquirrelTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/squirrel.png");
	private static final ResourceLocation EntityFishTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/fish.png");
	private static final ResourceLocation EntityAlpacaTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/alpaca.png");
	private static final ResourceLocation EntityMusketBulletTextures = new ResourceLocation(Reference.MOD_ID + ":" + "textures/entity/musket_bullet.png");
	
	public static void registerEntity() {
		int entityId = 200;
		EntityRegistry.registerModEntity(EntitySquirrelTextures, EntitySquirrel.class, "Squirrel", entityId, FSMod.instance, 64, 1, true, 0x982000, 0x421805);
		EntityRegistry.registerModEntity(EntityFishTextures, EntityFish.class, "Fish", entityId + 1, FSMod.instance, 64, 1, true, 0x6b9f93, 0xadbedb);
		EntityRegistry.registerModEntity(EntityAlpacaTextures, EntityAlpaca.class, "Alpaca", entityId + 2, FSMod.instance, 64, 1, true, 0xffffe6, 0x663300);
		EntityRegistry.registerModEntity(EntityMusketBulletTextures, EntityMusketBullet.class, "MusketBullet", entityId + 3, FSMod.instance, 64, 80, true, 0xffffe4, 0x663400);
	}
}
