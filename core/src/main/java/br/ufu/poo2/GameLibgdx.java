package br.ufu.poo2;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameLibgdx extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture texture;

	public void create () {
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("bg.jpg"));
	}

	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // This cryptic line clears the screen.
		batch.begin();
		batch.draw(texture, 10, 10);
		batch.end();
	}
}
