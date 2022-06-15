package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 100;
    int y = 300;
    int px = 700;
    int ph = 200;
    int ph2 = 200;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(135,206,235);
    	fill(255,255,0);
    	stroke(0,0,0);
    	ellipse(x, y, 100, 100);
    	if (mousePressed == true) {
    		for (int er = 0; er < 10; er++) {
    			y--;
    		}
    	}
    	y++;
    	fill(0,255,0);
    	rect(px,400,100,ph2);
    	rect(px,0,100,ph);
    	px = px - 5;
    	if (px == -100) {
    		px = 700;
    		int ra = new Random().nextInt(200 - 10 + 1) + 100;
    		ph = ra;
    		int ra2 = new Random().nextInt(500 - 200 + 1) + 200;
    		ph2 = ra2;
    	}
    }

    boolean intersectsPipes() { 
        if (y < upperPieHeight && x > pipeX && x < (pipeX+pipeWidth)){
           return true; }
       else if (y>lowerPipeTop && x > pipeX && x < (pipeX+pipeWidth)) {
           return true; }
       else { return false; }
}
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
