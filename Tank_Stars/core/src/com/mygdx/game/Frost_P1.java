package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class Frost_P1 implements Screen {

    SpriteBatch batch;
    Texture img;
    Sprite img_sprite;

    static MyGdxGame game;
    Vector3 coord;
    OrthographicCamera cam;

    public Frost_P1(MyGdxGame game){
        this.game = game;
        batch = new SpriteBatch();
        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();
        img = new Texture(Gdx.files.internal("Frost_P1.png"));
        img_sprite = new Sprite(img);
        img_sprite.setSize(w,h);
        this.coord = new Vector3();
        this.cam = new OrthographicCamera();
        this.cam.setToOrtho(false);
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

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