package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		
	}
}
