package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Game;

/*
public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;


	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		super.dispose();
		img.dispose();
	}
}
*/

public class MyGdxGame extends ApplicationAdapter {
	static void testmethod(String fname, int age){
		System.out.println(fname+"is"+age);
	}
	public static void main(String[] args){
		testmethod("Liam",5);
		testmethod("Jenny",20);
		
	}
}