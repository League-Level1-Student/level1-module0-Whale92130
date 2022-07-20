package _04_gui_from_scratch._3_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffect implements MouseListener {
	 public void run() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		button.addMouseListener(this);
		frame.add(button);
		frame.pack();
		frame.resize(200, 200);
		frame.setVisible(true);
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
		}
			else {
				System.out.println("File does not exist");
			}

	
}
//	 private void playSound(String soundFile) { 
//	     try {
//	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
//	          sound.play();
//	     } catch (Exception e) {
//	          e.printStackTrace();
//	     }
//	}
//	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		playSound("sawing-wood-daniel_simon.wav");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}