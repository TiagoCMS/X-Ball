package com.xball.screens;

import com.badlogic.gdx.Screen;
import com.xball.game.XBallGame;

public abstract class AbstractScreen implements Screen{


	
	public AbstractScreen() {
		
	}
	
	@Override
	public void render(float delta) {}

	@Override
	public void resize(int width, int height) {}

	@Override
	public void show() {}

	@Override
	public void hide() {}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void dispose() {}


}
