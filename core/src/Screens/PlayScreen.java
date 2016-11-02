package Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.chokwapeem.game.Gogoletsgo;


public class PlayScreen implements Screen{
	private Gogoletsgo game;
	private OrthographicCamera gamecam;
	private Viewport gamePort;
	private TmxMapLoader maploader;
	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	
	
	public PlayScreen(Gogoletsgo game) {
		this.game = game;
		gamecam = new OrthographicCamera();
		gamePort = new FitViewport(Gogoletsgo.WIDTH, Gogoletsgo.HEIGHT, gamecam);
		maploader = new TmxMapLoader();
		map = maploader.load("level1.tmx");
		renderer = new OrthogonalTiledMapRenderer(map);
		gamecam.position.set(gamePort.getScreenWidth() / 2, gamePort.getWorldHeight() / 2, 0);
	}
	
	@Override
	public void show() {
		
	}
	
	public void update(float deltaTime) {
		handleInput(deltaTime);
		gamecam.update();
		renderer.setView(gamecam);
	}

	private void handleInput(float deltaTime) {
		if(Gdx.input.isTouched()) {
			gamecam.position.x += 100 * deltaTime;
		}
	}

	@Override
	public void render(float delta) {
		update(delta);
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		renderer.render();
		
		
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
