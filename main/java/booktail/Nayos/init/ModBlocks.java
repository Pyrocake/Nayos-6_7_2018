package booktail.Nayos.init;

import java.util.ArrayList;
import java.util.List;

import booktail.Nayos.blocks.BlockBase;
import booktail.Nayos.blocks.CrucibleBlock;
import booktail.Nayos.blocks.NativusBlock;
import booktail.Nayos.blocks.NativusTunerBlock;
import booktail.Nayos.blocks.OreBlock;
import booktail.Nayos.blocks.machines.NativusCraftBaseBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block NATIVUS_ORE_BLOCK = new OreBlock("nativus_ore_block", Material.ROCK);
	
	public static final Block NATIVUS_BLOCK = new NativusBlock("nativus_block", Material.IRON);
	
	public static final Block NATIVUS_CRUCIBLE_BLOCK = new CrucibleBlock("nativus_crucible_block", Material.IRON);
	
	public static final Block NATIVUS_CRAFT_BASE_BLOCK = new NativusCraftBaseBlock("nativus_craft_base_block", Material.IRON);

	public static final Block NATIVUS_STRUCTURE_BLOCK = new BlockBase("nativus_structure_block", Material.IRON);
	
	public static final Block NATIVUS_TUNER_BLOCK = new NativusTunerBlock("nativus_tuner_block", Material.IRON);
	
	public static final Block NATIVUS_PORT = new BlockBase("nativus_port_block", Material.IRON);
	
}
