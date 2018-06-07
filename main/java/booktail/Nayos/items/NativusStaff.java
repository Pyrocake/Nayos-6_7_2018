package booktail.Nayos.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NativusStaff extends ItemBase{

	public NativusStaff(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	protected int maxStackSize = 1;
	
	
	
	
	/*public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		System.out.println("Success");
		return EnumActionResult.FAIL;
		
	}
	
	public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.BOW;
    }
	
	
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.BOW;
    }

	public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer EntityPlayer)
    {
        EntityPlayer.setItemInUse(ItemStack, this.getMaxItemUseDuration(ItemStack));
        return ItemStack;
    }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)

    {

        return EnumAction.BOW;
    }
	
	public static final String[] bowPullIconNameArray = new String[] {"nm:bow_pulling_0", "nm:bow_pulling_1", "nm:bow_pulling_2"};
        
	@Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 1000000; // however long your item can be used, in ticks
    }    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
