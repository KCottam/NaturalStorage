package com.lolmanxdxd.naturalstoragemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagicalTreePlanksBlock extends BlockBase {

	public MagicalTreePlanksBlock(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.WOOD);
		setLightLevel(9 / 15f);
		setResistance(15.0f);
		setHardness(2.0f);
	}

}
