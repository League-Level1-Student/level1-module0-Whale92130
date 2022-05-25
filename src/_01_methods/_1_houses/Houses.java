package _01_methods._1_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.penDown();
		rob.moveTo(100, 500);
		rob.setSpeed(30);
		int C = 0;
		// Check the recipe to find out what code to put here
		String H = JOptionPane.showInputDialog("How Tall small, medium, or large.");
		String CS = JOptionPane.showInputDialog("What color red, green, blue, yellow, black, or purple.");
		for(int hi = 0; hi < 10; hi++) {
		if (CS.equals("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if (CS.equals("green")) {
			rob.setPenColor(0, 255, 0);	
		}
		else if (CS.equals("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if (CS.equals("yellow")) {
			rob.setPenColor(255, 255, 0);
		}
		else if (CS.equals("black")) {
			rob.setPenColor(0, 0, 0);
		}
		else if (CS.equals("purple")) {
			rob.setPenColor(255, 87, 51);
		}

		
		drawHouse(H);
		}
}
	void drawHouse(String H) {
	if(H.equals("small")) {
		rob.move(60);
		pointy();
		rob.move(60);
		}
	else if(H.equals("medium")) {
		rob.move(120);
		pointy();
		rob.move(120);
	}
	else if(H.equals("large")) {
		rob.move(250);
		flat();
		rob.move(250);
	}
		
		rob.turn(-90);
		rob.setPenColor(30, 53, 4);
		rob.move(50);
		rob.turn(-90);
		
		}
	void pointy() {
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);

	}

	void flat() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
}
