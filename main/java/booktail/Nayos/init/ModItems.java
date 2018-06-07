package booktail.Nayos.init;

import java.util.ArrayList;
import java.util.List;

import booktail.Nayos.items.ItemBase;
import booktail.Nayos.items.NativusStaff;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	
	//public static final ToolMaterial MATERIAL_NATIVUS_INGOT = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
	
	
	//Items
	public static final Item NATIVUS_INGOT = new ItemBase("nativus_ingot");
	public static final Item NATIVUS_STAFF = new NativusStaff("nativus_staff");
	public static final Item FOCI_LEFT = new ItemBase("foci_left");
	public static final Item FOCI_RIGHT = new ItemBase("foci_right");
	public static final Item RESONANT_PLATE = new ItemBase("resonant_plate");
	
}
