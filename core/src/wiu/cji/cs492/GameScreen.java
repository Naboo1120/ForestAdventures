package wiu.cji.cs492;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameScreen implements Screen {

    final ForestAdventures game;

    //camera and view port
    private OrthographicCamera gamecam;
    private Viewport gamePort;

    //Tiled map variables
    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    public GameScreen(final ForestAdventures game){
        this.game = game;

        //Camera
        gamecam = new OrthographicCamera();
        gamecam.position.set(0,0,0);
        gamePort = new FitViewport(ForestAdventures.V_WIDTH,ForestAdventures.V_HEIGHT, gamecam);

        //Loads map
        mapLoader = new TmxMapLoader();
        map = mapLoader.load("Map Test.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
    }

    public TiledMap getMap(){
        return map;
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0.2f,0);
        //Renders the Map
        renderer.render();


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
