package com.lolmanxdxd.naturalstoragemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagicalTreeHeartBlock extends BlockBase {

	public MagicalTreeHeartBlock(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.WOOD);
		//setHarvestLevel("axe",0);
		setLightLevel(9 / 15f);
		setResistance(15.0f);
		setHardness(1.5f);

	}

}
