package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
    public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        button.addActionListener(this);
        frame.add(button);
        frame.pack();
        frame.resize(300,300);
        
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if(rand == 0) {
		JOptionPane.showMessageDialog(null, "You will live tmr.");
		}
		else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will buy some pants this year.");
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will make a new friend this week.");
		}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will die at the age of 99.");
		}
		else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You will become an amzing programer");
		}
		
	} 
}