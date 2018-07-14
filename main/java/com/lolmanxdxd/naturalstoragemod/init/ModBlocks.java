package com.lolmanxdxd.naturalstoragemod.init;

import java.util.ArrayList;
import java.util.List;

import com.lolmanxdxd.naturalstoragemod.blocks.BlockBase;
import com.lolmanxdxd.naturalstoragemod.blocks.MagicalTreeCoreBlock;
import com.lolmanxdxd.naturalstoragemod.blocks.MagicalTreeHeartBlock;
import com.lolmanxdxd.naturalstoragemod.blocks.MagicalTreeLeavesBlock;
import com.lolmanxdxd.naturalstoragemod.blocks.MagicalTreePlanksBlock;
import com.lolmanxdxd.naturalstoragemod.blocks.MagicalTreeTrunkBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MAGICAL_TREE_HEART_BLOCK = new MagicalTreeHeartBlock("magical_tree_heart_block", Material.WOOD);
	public static final Block MAGICAL_TREE_BARK_BLOCK = new MagicalTreeTrunkBlock("magical_tree_bark_block", Material.WOOD);
	public static final Block MAGICAL_TREE_BARK_PLANKS_BLOCK = new MagicalTreePlanksBlock("magical_tree_bark_planks_block", Material.WOOD);	
	public static final Block MAGICAL_TREE_ROOT_BLOCK = new MagicalTreeTrunkBlock("magical_tree_root_block", Material.WOOD);
	public static final Block MAGICAL_TREE_CORE_BLOCK = new MagicalTreeCoreBlock("magical_tree_core_block", Material.WOOD);
	public static final Block MAGICAL_TREE_LEAVES_BLOCK = new MagicalTreeLeavesBlock("magical_tree_leaves_block", Material.LEAVES);
	
}
