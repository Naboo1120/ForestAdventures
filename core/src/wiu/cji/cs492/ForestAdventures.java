package wiu.cji.cs492;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class ForestAdventures extends Game{

	//Sprite Batch for maps, items and player
	public SpriteBatch batch;
	public BitmapFont font;

	//Screen Size
	public static final int V_WIDTH = 800;
	public static final int V_HEIGHT = 400;


	@Override
	public void create () {

		batch = new SpriteBatch();
		font = new BitmapFont();

		this.setScreen(new MainMenuScreen(this));

	}

	@Override
	public void render () {
		super.render();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}
