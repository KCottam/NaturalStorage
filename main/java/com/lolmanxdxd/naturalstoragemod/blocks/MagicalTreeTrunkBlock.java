package com.lolmanxdxd.naturalstoragemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class MagicalTreeTrunkBlock extends BlockBase {

	public MagicalTreeTrunkBlock(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.WOOD);
		setResistance(10.0f);
		setHardness(2.0f);

	}

}
