package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class SoundEffectsMachine implements ActionListener {
	    public void showButton() {
	        System.out.println("Button clicked");
	        JFrame frame=new JFrame();
	        frame.setVisible(true);
	        JPanel panel=new JPanel();
	        frame.add(panel);
	        JButton button = new JButton();
	        frame.add(button);
	        JButton button1=new JButton();
	        frame.add(button1);
	        frame.pack();
	        button.addActionListener(this);
	   }
	    public static void main(String[] args) {
			new SoundEffectsMachine().showButton();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		private void playSound(String fileName) {
		     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
		     sound.play();
		}
	}
