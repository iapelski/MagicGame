package pl.game.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;

	public KeyInput(Handler handler) {
		this.handler = handler;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// key events for player 1
				if (key == KeyEvent.VK_W)
					tempObject.setVelY(-5);
				if (key == KeyEvent.VK_S)
					tempObject.setVelY(5);
				if (key == KeyEvent.VK_D)
					tempObject.setVelY(5);
				if (key == KeyEvent.VK_A)
					tempObject.setVelY(-5);
			}
			if (tempObject.getId() == ID.Player2) {
				// key events for player 1
				if (key == KeyEvent.VK_UP)
					tempObject.setVelY(-5);
				if (key == KeyEvent.VK_DOWN)
					tempObject.setVelY(5);
				if (key == KeyEvent.VK_RIGHT)
					tempObject.setVelY(5);
				if (key == KeyEvent.VK_LEFT)
					tempObject.setVelY(-5);
			}
		}

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// key events for player 1
				if (key == KeyEvent.VK_W)
					tempObject.setVelY(0);
				if (key == KeyEvent.VK_S)
					tempObject.setVelY(0);
				if (key == KeyEvent.VK_D)
					tempObject.setVelY(0);
				if (key == KeyEvent.VK_A)
					tempObject.setVelY(0);
			}
			if (tempObject.getId() == ID.Player2) {
				// key events for player 1
				if (key == KeyEvent.VK_UP)
					tempObject.setVelY(0);
				if (key == KeyEvent.VK_DOWN)
					tempObject.setVelY(0);
				if (key == KeyEvent.VK_RIGHT)
					tempObject.setVelY(0);
				if (key == KeyEvent.VK_LEFT)
					tempObject.setVelY(0);
			}
		}

	}
}
