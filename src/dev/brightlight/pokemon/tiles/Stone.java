package dev.brightlight.pokemon.tiles;

import dev.brightlight.pokemon.gfx.Assets;

public class Stone extends Tile{

	public Stone(int id) {
		super(Assets.stone, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}
	
}
