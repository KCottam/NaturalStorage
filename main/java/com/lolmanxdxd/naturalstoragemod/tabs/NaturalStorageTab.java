package com.lolmanxdxd.naturalstoragemod.tabs;

import com.lolmanxdxd.naturalstoragemod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NaturalStorageTab extends CreativeTabs {

	public NaturalStorageTab(String label) {
		
		super("naturalstoragetab");
		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.MAGICAL_TREE_CORE_BLOCK);
	}
	
}
