package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String args[]) {
		int X = 400;
		int Y = 400;
		
		Thread t1 = new Thread(()->{
			Robot rob = new Robot();
			rob.setPenWidth(10);
			rob.setX(X);
			rob.setY(Y);
			rob.setPenColor(Color.blue);
			for(int i = 0; i < 30; i++) {
				rob.penDown();
				rob.move(30);
				rob.turn(360/30);
			}
		});
		
		Thread t2 = new Thread(()->{
			Robot rob = new Robot();
			rob.setPenWidth(10);
			rob.setX(X + 240);
			rob.setY(Y);
			rob.setPenColor(Color.black);
			for(int i = 0; i < 30; i++) {
				rob.penDown();
				rob.move(30);
				rob.turn(360/30);
			}
		});
		
		Thread t3 = new Thread(()->{
			Robot rob = new Robot();
			rob.setPenWidth(10);
			rob.setX(X + 480);
			rob.setY(Y);
			rob.setPenColor(Color.red);
			for(int i = 0; i < 30; i++) {
				rob.penDown();
				rob.move(30);
				rob.turn(360/30);
			}
		});
		
		Thread t4 = new Thread(()->{
			Robot rob = new Robot();
			rob.setPenWidth(10);
			rob.setX(X + 120);
			rob.setY(Y + 200);
			rob.setPenColor(Color.yellow);
			for(int i = 0; i < 30; i++) {
				rob.penDown();
				rob.move(30);
				rob.turn(360/30);
			}
		});
		
		Thread t5 = new Thread(()->{
			Robot rob = new Robot();
			rob.setPenWidth(10);
			rob.setX(X + 360);
			rob.setY(Y + 200);
			rob.setPenColor(Color.green);
			for(int i = 0; i < 30; i++) {
				rob.penDown();
				rob.move(30);
				rob.turn(360/30);
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
