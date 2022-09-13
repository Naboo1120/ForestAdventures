package wiu.cji.cs492;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ForestAdventures extends Game {


	public SpriteBatch batch;   //test
	public BitmapFont font;


	
	@Override
	public void create () {

		batch = new SpriteBatch();
		font =  new BitmapFont();

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
