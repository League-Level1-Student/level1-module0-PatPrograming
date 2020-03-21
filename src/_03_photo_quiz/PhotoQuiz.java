package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseMotionListener {
int score=0;
	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String image=("https://pm1.narvii.com/6864/dae48a3fb515e88ff63430597c11e8d0571d363er1-800-450v2_hq.jpg");
		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component
Component component=createImage(image);
component.addMouseMotionListener(this);
		// 4. add the image to the quiz window
quizWindow.add(component);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question= JOptionPane.showInputDialog("What is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(question.equals("A God.")) {
	System.out.println("Correct.");
	score+=1;
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	System.out.println("Incorrect.");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line
		// of code)
String image1=("https://media.wsimag.com/attachments/716f6066bcc6b29e1054ca0264022c56d729607c/store/fill/1090/613/e6101c269024548aa40ddcac9b3fa54eee13cb721e7c8f8bcdf890436959/A-puffer-fish.jpg");
Component component1;
component1=createImage(image1);
component1.addMouseMotionListener(this);
		// 11. add the second image to the quiz window
quizWindow.add(component1);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String question1=JOptionPane.showInputDialog("What is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if (question1.equals("A pufferfish.")){
	System.out.println("Correct.");
	score+=1;
}
else {
	System.out.println("Incorrect.");
}
JOptionPane.showMessageDialog(null, "Your score was "+ score);
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Mouse dragged.");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse moved.");
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
