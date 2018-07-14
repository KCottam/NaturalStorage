package com.lolmanxdxd.naturalstoragemod.util.compat;

import com.lolmanxdxd.naturalstoragemod.init.ModBlocks;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {

	public static void registerOres() {
		
		OreDictionary.registerOre("treeWood", ModBlocks.MAGICAL_TREE_BARK_BLOCK);
		OreDictionary.registerOre("treeWood", ModBlocks.MAGICAL_TREE_ROOT_BLOCK);
		OreDictionary.registerOre("treeWood", ModBlocks.MAGICAL_TREE_HEART_BLOCK);
		OreDictionary.registerOre("treeWood", ModBlocks.MAGICAL_TREE_CORE_BLOCK);
		OreDictionary.registerOre("treeWood", ModBlocks.MAGICAL_TREE_LOG_BLOCK);
		
		OreDictionary.registerOre("treeLeaves", ModBlocks.MAGICAL_TREE_LEAVES_BLOCK);
		
		OreDictionary.registerOre("plankWood", ModBlocks.MAGICAL_TREE_BARK_PLANKS_BLOCK);
	}
}
