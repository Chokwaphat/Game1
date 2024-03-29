package com.chokwapeem.game;
 
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import Screens.PlayScreen;

public class Gogoletsgo extends Game {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 208;
	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	} 

	@Override
	public void render () {
		super.render();
	}
}
