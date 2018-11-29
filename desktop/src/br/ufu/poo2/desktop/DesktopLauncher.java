package br.ufu.poo2.desktop;

import br.ufu.poo2.GameLibgdx;
import br.ufu.poo2.testLibgdx.Test;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Test(), config);
	}
}
