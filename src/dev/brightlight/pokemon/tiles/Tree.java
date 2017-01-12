package dev.brightlight.pokemon.tiles;

import dev.brightlight.pokemon.gfx.Assets;

public class Tree extends Tile{

	public Tree(int id) {
		super(Assets.tree, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
	
}
