package Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.chokwapeem.game.Gogoletsgo;
import Scenes.HUD;

public class PlayScreen implements Screen{
	private Gogoletsgo game;
	private OrthographicCamera gamecam;
	private Viewport gamePort;
	private HUD hud;
	
	public PlayScreen(Gogoletsgo game) {
		this.game = game;
		gamecam = new OrthographicCamera();
		gamePort = new FitViewport(Gogoletsgo.WIDTH, Gogoletsgo.HEIGHT, gamecam);
		hud = new HUD(game.batch);
	}
	
	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
		hud.stage.draw();
		
	}

	@Override
	public void resize(int width, int height) {
		gamePort.update(width, height);
		
	}

	@Override
	public void pause() {

		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

}
