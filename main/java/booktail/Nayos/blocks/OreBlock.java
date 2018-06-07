package booktail.Nayos.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreBlock extends BlockBase 
{

	public OreBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.1f);
		
	}
}
