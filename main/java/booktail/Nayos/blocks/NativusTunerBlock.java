package booktail.Nayos.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class NativusTunerBlock extends BlockBase 
{
	protected static final AxisAlignedBB TUNERAABB = new AxisAlignedBB(0.0625D, 0D, 0.0625D, 1.00-0.0625D, .75D, 1.0-0.0625D);
	
	public NativusTunerBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		
	}
	
	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TUNERAABB;

    }

	@Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return TUNERAABB;
    }
	
	public boolean isOpaqueCube(IBlockState state)
	  {
	      return false;
	  }

	public boolean isFullCube(IBlockState state)
	  {
	      return false;
	  }

}
