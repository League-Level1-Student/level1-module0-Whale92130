package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String image = "https://images.unsplash.com/photo-1481349518771-20055b2a7b24?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cmFuZG9tfGVufDB8fDB8fA%3D%3D&w=1000&q=80";
		// 2. create a variable of type "Component" that will hold your image
		Component imageC;
		// 3. use the "createImage()" method below to initialize your Component
		imageC = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(imageC);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		quizWindow.resize(1000, 1000);
		// 6. ask a question that relates to the image
		String a = JOptionPane.showInputDialog("Is this a banana?");
		// 7. print "CORRECT" if the user gave the right answer
		if (a.equalsIgnoreCase("Yes")) {
			System.out.println("Wrong, its a Plantain.");
		}
		else {
			System.out.println("Correct.");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(imageC);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = "https://i.pinimg.com/474x/82/22/4a/82224aa00fd121ddb2ce20db2c47c8b1--brain-teasers-perception.jpg";
		// 11. add the second image to the quiz window
		Component image2C;
		image2C = createImage(image2);
		quizWindow.add(image2C);
		// 12. pack the quiz window
		quizWindow.pack();
		quizWindow.resize(1000, 1000);
		// 13. ask another question
		String b = JOptionPane.showInputDialog("Is there a old lady or a young lady?(answer with: old, young, etc)");
		// 7. print "CORRECT" if the user gave the right answer
		if (b.equalsIgnoreCase("old")) {
			System.out.println("Incorrect");	
		}
		else if(b.equalsIgnoreCase("both")){
			System.out.println("Correct.");
		}
		else {
			System.out.println("Incorrect");	
		}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
