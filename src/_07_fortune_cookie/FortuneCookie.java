package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    public void showButton() {
        System.out.println("Button clicked");
        JFrame frame=new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }
    public static void main(String[] args) {
        new FortuneCookie().showButton();
        
  }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo.");
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(null, "You will become a chef.");
		}
		if (rand==1) {
			JOptionPane.showMessageDialog(null, "You will become a doctor.");
		}
		if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will become a programmer.");
		}
		if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will become a lawyer.");
		}
		if(rand==4) {
			JOptionPane.showMessageDialog(null, "You will become a research scientist.");
		}
		
	}
}
