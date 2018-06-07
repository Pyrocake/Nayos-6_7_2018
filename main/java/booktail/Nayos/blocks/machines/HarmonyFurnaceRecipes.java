package booktail.Nayos.blocks.machines;

import java.util.Map;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset.Entry;
import com.google.common.collect.Table;

import booktail.Nayos.init.ModBlocks;
import booktail.Nayos.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HarmonyFurnaceRecipes {
	private static final HarmonyFurnaceRecipes INSTANCE = new HarmonyFurnaceRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static HarmonyFurnaceRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private HarmonyFurnaceRecipes() 
	{
		/*addHarmonyRecipe(new ItemStack(Thing 1), new ItemStack(Thing 2), new ItemStack(Result), 5.0F);*/
		addHarmonyRecipe(new ItemStack(Blocks.DIRT), new ItemStack(Blocks.DIRT), new ItemStack(Blocks.DIAMOND_BLOCK), 5.0F);
	}

	
	public void addHarmonyRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getHarmonyResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getHarmonyResult(ItemStack input1, ItemStack input2) 
	{
		for(java.util.Map.Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(java.util.Map.Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}//possible bug area
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getHarmonyExperience(ItemStack stack)
	{
		for (java.util.Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
