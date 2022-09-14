package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;
	int frogX = 300;
	int frogY = 500;
	Car car1;
	Car car2;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		car1 = new Car(600, 200, 100, 2, this);
		car2 = new Car(0, 150, 100, 1, this);
	}

	@Override
	public void draw() {
		background(12, 91, 210);
		fill(3, 180, 50);
		ellipse(frogX, frogY, 100, 100);
		if (frogX < 0) {
			frogX = 0;
		} else if (frogX > WIDTH) {
			frogX = WIDTH;
		}
		if (frogY < 0) {
			frogY = 0;
		} else if (frogY > HEIGHT) {
			frogY = HEIGHT;
		}
		car1.display();
		car1.carMoveLeft();
		car2.display();
		car2.carMoveRight();
		intersects(car1);
		intersects(car2);
		if (intersects(car1) == false) {
		} else {
		frogY = 500;
		} 
		if (intersects(car2) == false) {
		} else {
		frogY = 500;
		} 

	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP) {
				frogY -= 3;
			}
			if (keyCode == DOWN) {
				frogY += 3;
			}
			if (keyCode == RIGHT) {
				frogX += 3;
			}
			if (keyCode == LEFT) {
				frogX -= 3;
			}
		}
	}

	boolean intersects(Car car) {
		if ((frogY > car.getY() && frogY < car.getY() + 50)
				&& (frogX > car.getX() && frogX < car.getX() + car.getSize())) {
			return true;
		} else {
			return false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
