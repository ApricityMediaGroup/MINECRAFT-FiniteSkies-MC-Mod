package finiteskies.fsmod;

import finiteskies.fsmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FSModTab extends CreativeTabs{

	public FSModTab(String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return ModItems.strawberry;
	}

}
