package finiteskies.fsmod.entity;

import java.util.BitSet;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.entity.EntitySquirrel;
import finiteskies.fsmod.entity.EntityFish;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	private static final ModEntities INSTANCE = new ModEntities();
	private BitSet availableIndicies;
	
	public static ModEntities instance() {
		return INSTANCE;
	}
	private ModEntities() {
		availableIndicies = new BitSet(256);
		availableIndicies.set(1, 255);
		for (Object id : EntityList.ID_TO_CLASS.keySet()) {
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

	
//	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
//		int randomId = findGlobalUniqueEntityId();
//		EntityRegistry.registerModEntity(entityClass, entityName, randomId, FSMod.instance, 64, 1, true, solidColor, spotColor);
//	}
	
	public static void registerEntity() {
		int entityId = findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntitySquirrel.class, "Squirrel", entityId, FSMod.instance, 64, 1, true, 0x982000, 0x421805);
		EntityRegistry.registerModEntity(EntityFish.class, "Fish", entityId + 1, FSMod.instance, 64, 1, true, 0x6b9f93, 0xadbedb);
		EntityRegistry.registerModEntity(EntityLlama.class, "Llama", entityId + 2, FSMod.instance, 64, 1, true, 0xffffe6, 0x663300);
	}
}
