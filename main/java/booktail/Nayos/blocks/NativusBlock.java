package booktail.Nayos.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NativusBlock extends BlockBase 
{

	public NativusBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
		
	}

}
