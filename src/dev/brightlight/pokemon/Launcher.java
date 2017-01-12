package dev.brightlight.pokemon;

import dev.brightlight.pokemon.Game;

public class Launcher {

	public static void main(String[] args) {
		Game game = new Game("Pokemon", 900, 600); //640 360
		game.start();
	}

}
