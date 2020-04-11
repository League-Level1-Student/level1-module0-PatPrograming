package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutnessTv implements ActionListener{
	JButton button=new JButton();
	JButton button1=new JButton();
	JButton button2=new JButton();
public void showButton() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	frame.add(panel);
	frame.pack();
	
	panel.add(button);
	frame.pack();
	button.addActionListener(this);
	
	panel.add(button1);
	frame.pack();
	button1.addActionListener(this);

	panel.add(button2);
	frame.pack();
	button2.addActionListener(this);
}
public static void main(String[] args) {
new CutnessTv().showButton();

}
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button) {
		showDucks();
	}
	if (e.getSource()==button1) {
		showFrog();
	}
	if (e.getSource()==button2) {
		showFluffyUnicorns();
	}
}
}
