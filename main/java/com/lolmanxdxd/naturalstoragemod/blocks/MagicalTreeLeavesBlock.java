package com.lolmanxdxd.naturalstoragemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagicalTreeLeavesBlock extends BlockBase {

	public MagicalTreeLeavesBlock(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.PLANT);
		setLightLevel(14 / 15f);
		setLightOpacity(1);
		setHardness(0.2f);
		setResistance(1.0f);
	}

}
