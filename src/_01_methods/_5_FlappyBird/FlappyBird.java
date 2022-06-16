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
    int py = 0;
    int py2 = 0;
    int ff = 0;
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
    	ph2 = 200;
    	rect(px,py,100,ph);
    	rect(px,py2,100,300);
    	px = px - 5;
    	if (px == -100) {
    		px = 700;
    		int ra = new Random().nextInt(200 - 10 + 1) + 100;
    		py2 = py + ra + 200;
    		ph = ra;
    		
    		
    	}
    	if(ff > 200) {
    	intersectsPipes();
    	}
    	ff++;
    }

    void intersectsPipes() { 
        if (y < ph && px < 120){
        	System.out.println("Game Over");
        	exit();
        }
       else if (y>py2 && x > px) {
    	   System.out.println("Game Over");
    	   exit();
       }
       else {  }
}
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
