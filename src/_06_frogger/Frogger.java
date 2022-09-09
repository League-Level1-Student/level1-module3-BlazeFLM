package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;
	int frogX;
	int frogY;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		background(12, 91, 210);
		fill(3, 180, 50);
		ellipse(300, 200, 100, 100);

	}
	void ifKeyPressed(){
	    if(key == CODED){
	        if(keyCode == UP)
	        {
	            frogY -= 3;
	        }
	        else if(keyCode == DOWN)
	        {
	            frogY += 3;
	        }
	        else if(keyCode == RIGHT)
	        {
	        	frogX += 3;
	        }
	        else if(keyCode == LEFT)
	        {
	            frogX -= 3;
	        }
	    }
	}
	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
