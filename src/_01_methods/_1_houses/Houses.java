package _01_methods._1_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		int C = 0;
		// Check the recipe to find out what code to put here
		String H = JOptionPane.showInputDialog("How Tall small, meddium, or large.");
		String CS = JOptionPane.showInputDialog("What color red, green, blue, yellow, black, or purple.");
		if (CS.equals("red")) {
			C = 1;
		}
		else if (CS.equals("green")) {
			C = 2;
		}
		else if (CS.equals("blue")) {
			C = 3;
		}
		else if (CS.equals("yellow")) {
			C = 4;
		}
		else if (CS.equals("black")) {
			C = 5;
		}
		else if (CS.equals("purple")) {
			C = 6;
		}
		drawHouse(H, C);
	
}
	void drawHouse(String H, int color) {
		pointy(H, color);
		}
	void pointy(String H, int color) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(30);
		if (H <= 150) {
		rob.moveTo(100, 500);
		rob.move(100);
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
		rob.move(100);
		rob.turn(-90);
		rob.setPenColor(0, 255, 0);
		rob.move(80);
	}
	}	
	void flat() {
	
	}
}
