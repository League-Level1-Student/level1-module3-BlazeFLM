package _06_frogger;

import processing.core.PApplet;

public class Car {
	PApplet app;
	int carX;
	int carY;
	int carSize;
	int carSpeed;

	public Car(int carX, int carY, int carSize, int carSpeed, PApplet app) {
		this.carX = carX;
		this.carY = carY;
		this.carSize = carSize;
		this.carSpeed = carSpeed;
		this.app = app;
	}

	void display() {
		app.fill(0, 255, 0);
		app.rect(carX, carY, carSize, 50);
	}
	void carMoveLeft() {
		carX = carX - carSpeed;
		if(carX < 0) {
			carX = Frogger.WIDTH;
		}
	}
	void carMoveRight( ) {
		carX = carX + carSpeed;
		if(carX > Frogger.WIDTH) {
			carX = 0;
		}
	}
	public int getX() {
	return carX;
	}
	public int getY() {
		return carY;
	}
	public int getSize() {
		return carSize;
	}
	
}