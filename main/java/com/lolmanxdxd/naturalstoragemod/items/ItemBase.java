package com.lolmanxdxd.naturalstoragemod.items;

import com.lolmanxdxd.naturalstoragemod.Main;
import com.lolmanxdxd.naturalstoragemod.init.ModItems;
import com.lolmanxdxd.naturalstoragemod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.NATURALSTORAGETAB);
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {		
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
