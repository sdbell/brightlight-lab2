package dev.brightlight.pokemon.states;

import java.awt.Graphics;
import dev.brightlight.pokemon.Game;
import dev.brightlight.pokemon.Handler;
import dev.brightlight.pokemon.entities.creatures.Player;
import dev.brightlight.pokemon.gfx.Assets;
import dev.brightlight.pokemon.tiles.Tile;
import dev.brightlight.pokemon.worlds.World;

public class GameState extends State{
	
	private Player player;
	private World world;

	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 100);
		
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g){
		world.render(g);
		player.render(g);
	}
	
}
