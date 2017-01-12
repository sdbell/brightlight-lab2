package dev.brightlight.pokemon.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 16, height = 16;
	
	//public static BufferedImage m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25, m26, m27, m28, m29, m30, m31, m32;
	//public static BufferedImage[] m;
	public static BufferedImage grass, tree, snow, stone;
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	public static BufferedImage pokemon_logo = ImageLoader.loadImage("/textures/pokemon_logo.png");
	//public static BufferedImage moltres; 
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tileset.png"));
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/player_sprites.png"));
		grass = sheet.crop(0, 0, width, height);
		tree = sheet.crop(width, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		snow = sheet.crop(width * 4, 0, width, height);
		//moltres = sheet2.crop(0, 0, 147, 130);
		player_down = new BufferedImage[2];
		player_up = new BufferedImage[2];
		player_right = new BufferedImage[2];
		player_left = new BufferedImage[2];
		player_down[0] = sheet2.crop(277, 116, 39, 46);
		player_down[1] = sheet2.crop(277, 170, 39, 46);
		player_up[0] = sheet2.crop(115, 62, 39, 46);
		player_up[1] = sheet2.crop(277, 7, 39, 46);
		player_right[0] = sheet2.crop(63, 62, 39, 46);
		player_right[1] = sheet2.crop(63, 116, 39, 46);
		player_left[0] = sheet2.crop(7, 170, 39, 46);
		player_left[1] = sheet2.crop(7, 62, 39, 46);
		
		//m = new BufferedImage[33];
		/*
		m[1] = sheet.crop(0, 0, width, height);
		m[2] = sheet.crop(width, 0, width, height);
		m[3] = sheet.crop(width * 2, 0, width, height);
		m[4] = sheet.crop(width * 3, 0, width, height);
		m[5] = sheet.crop(width * 4, 0, width, height);
		m[6] = sheet.crop(width * 5, 0, width, height);
		m[7] = sheet.crop(width * 6, 0, width, height);
		m[8] = sheet.crop(width * 7, 0, width, height);
		
		m[9] = sheet.crop(0, height, width, height);
		m[10] = sheet.crop(width, height, width, height);
		m[11] = sheet.crop(width * 2, height, width, height);
		m[12] = sheet.crop(width * 3, height, width, height);
		m[13] = sheet.crop(width * 4, height, width, height);
		m[14] = sheet.crop(width * 5, height, width, height);
		m[15] = sheet.crop(width * 6, height, width, height);
		m[16] = sheet.crop(width * 7, height, width, height);
		
		m[17] = sheet.crop(0, height * 2, width, height);
		m[18] = sheet.crop(width, height * 2, width, height);
		m[19] = sheet.crop(width * 2, height * 2, width, height);
		m[20] = sheet.crop(width * 3, height * 2, width, height);
		m[21] = sheet.crop(width * 4, height * 2, width, height);
		m[22] = sheet.crop(width * 5, height * 2, width, height);
		m[23] = sheet.crop(width * 6, height * 2, width, height);
		m[24] = sheet.crop(width * 7, height * 2, width, height);
		
		m[25] = sheet.crop(0, height * 3, width, height);
		m[26] = sheet.crop(width, height * 3, width, height);
		m[27] = sheet.crop(width * 2, height * 3, width, height);
		m[28] = sheet.crop(width * 3, height * 3, width, height);
		m[29] = sheet.crop(width * 4, height * 3, width, height);
		m[30] = sheet.crop(width * 5, height * 3, width, height);
		m[31] = sheet.crop(width * 6, height * 3, width, height);
		m[32] = sheet.crop(width * 7, height * 3, width, height);
		*/
		
	}
}