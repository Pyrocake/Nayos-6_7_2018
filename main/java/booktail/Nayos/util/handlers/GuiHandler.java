package booktail.Nayos.util.handlers;

import booktail.Nayos.blocks.machines.ContainerHarmony;
import booktail.Nayos.blocks.machines.GuiHarmonyFurnace;
import booktail.Nayos.blocks.machines.TileEntityNativusHarmony;
import booktail.Nayos.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_NATIVUS_CRAFT_BASE_BLOCK) return new ContainerHarmony(player.inventory, (TileEntityNativusHarmony)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_NATIVUS_CRAFT_BASE_BLOCK) return new GuiHarmonyFurnace(player.inventory, (TileEntityNativusHarmony)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}