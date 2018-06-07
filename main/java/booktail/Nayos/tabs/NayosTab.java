package booktail.Nayos.tabs;

import booktail.Nayos.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NayosTab extends CreativeTabs{
	
	public NayosTab(String label){super("nayostab");
		this.setBackgroundImageName("nayostabicon.png");}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.NATIVUS_INGOT);
	}

}
