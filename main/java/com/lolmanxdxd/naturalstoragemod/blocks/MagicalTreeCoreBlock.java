package com.lolmanxdxd.naturalstoragemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagicalTreeCoreBlock extends BlockBase {

	public MagicalTreeCoreBlock(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHarvestLevel("axe",2);
		setLightLevel(15 / 15f);
		setResistance(20.0f);
		setHardness(2.0f);

	}

}
