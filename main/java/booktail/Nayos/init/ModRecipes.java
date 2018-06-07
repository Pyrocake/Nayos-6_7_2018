package booktail.Nayos.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.NATIVUS_ORE_BLOCK, new ItemStack(ModItems.NATIVUS_INGOT, 1), 1.5f);
	}
	
}
