package wiu.cji.cs492;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

//Commit test 9-7
public class MainMenuScreen implements Screen{
    final ForestAdventures game;
    OrthographicCamera camera;

    //Each image needed with adjusted heights and widths
    Texture playButton;

    Texture settingsButton;

    Texture ExitButton;

    Texture Background;
    private static final int BACKGROUND_HEIGHT = 400;
    private static final int BACKGROUND_WIDTH = 800;

    public MainMenuScreen(final ForestAdventures game){
        this.game = game;

        //Background and Buttons
        Background = new Texture("Main Menu Assets/forest.png");

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800,400);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        ScreenUtils.clear(0,0,0.2f,0);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(Background, 0,0 , BACKGROUND_WIDTH,BACKGROUND_HEIGHT);
        game.batch.end();

    }

    @Override
    public void resize(int width, int height) {

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
