package com.cricketcraft.chisel.carving;

import net.minecraft.block.Block;
import net.minecraft.util.IIcon;

import com.cricketcraft.chisel.client.render.TextureSubmap;

public class CarvableVariation {

	public String blockName;
	public String description;
	public int metadata;
	public int kind;

	public Block block;
	public int blockMeta;

	public String texture;

	public IIcon icon;
	public IIcon iconTop;
	public IIcon iconBot;

	public CarvableVariationCTM ctm;
	public TextureSubmap seamsCtmVert;
	public TextureSubmap variations9;

	public TextureSubmap submap;
	public TextureSubmap submapSmall;

	static class CarvableVariationCTM {

		TextureSubmap seams[] = new TextureSubmap[3];
	}
}
