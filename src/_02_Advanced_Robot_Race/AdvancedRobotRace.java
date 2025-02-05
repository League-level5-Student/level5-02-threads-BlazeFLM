package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		int X = 400;
		int Y = 1000;
		Random dom = new Random();
		
		Thread[] thrds = new Thread[5];
		Robot[] bots = new Robot[5];
		
		for(int i = 0; i < 5; i++) {
            bots[i] = new Robot();
        }
		
		for(int i = 0; i < 5; i++) {
			int k = i;
			thrds[i] = new Thread(()->{
				bots[k].setX(X + (k * 100));
				bots[k].setY(Y);
				for(Robot r : bots) {
					r.move(dom.nextInt(100));
				}
				//get program to run indefinitely until a bot crosses y = 100
			});
		}
		
		
		for(Thread t : thrds) {
			t.start();
		}
		
	}
}
