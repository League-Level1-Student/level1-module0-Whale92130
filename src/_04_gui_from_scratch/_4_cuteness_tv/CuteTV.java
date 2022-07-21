package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuteTV implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
		void showDucks() {
		     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}

		void showFrog() {
		     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}

		void showFluffyUnicorns() {
		     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}

		void playVideo(String videoID) {
		     
		     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
		     //work on some Linux implementations 
		     try {
		     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
		     if (Runtime.getRuntime().exec(new String[] { 
		      "which", "xdg- open" }).getInputStream().read() != -1) {
		     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
		     }
		     } else {
		          URI uri = new URI(videoID);
		          java.awt.Desktop.getDesktop().browse(uri);
		     }      } catch (Exception e) {
		          e.printStackTrace();
		     }
		
	}
		void run() {
			
			JPanel panel = new JPanel();
			button.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			panel.add(button);
			panel.add(button2);
			panel.add(button3);
			button.setText("Duck Video");
			button2.setText("Frog Video");
			button3.setText("Fluffy Unicorn Video");
			frame.add(panel);
			frame.pack();
			frame.resize(300, 100);
			frame.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) arg0.getSource();
			
			if (buttonPressed == button) {
				showDucks();
			}
			else if (buttonPressed == button2) {
				showFrog();
			}
			else if (buttonPressed == button3) {
				showFluffyUnicorns();
}
		}
}
