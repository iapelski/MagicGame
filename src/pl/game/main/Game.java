package pl.game.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 5749895903263842126L;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH /12*9;
	
	public Game() {
		new Window(WIDTH, HEIGHT, "Let's Build a game", this);
	}
	public synchronized void start() {
		
	}
	
	public void run() {
		
	}
	

	public static void main(String args[]) {
		new Game();
	}

}
