package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	Robot robo=new Robot();
	public void run() {
		
		robo.changeRobot("https://pm1.narvii.com/6615/b304648623afa1db2828c8082b99050b1c88a573_128.jpg");
		robo.miniaturize();
		robo.setX(10);
		robo.setY(490);
		robo.penDown();
		robo.setSpeed(20);
		robo.setPenColor(Color.white);
		for (int i = 0; i < 3; i++) {
			makePointy("small");
			makePointy("medium");
			makeFlatHouse("large");
		}

		robo.setWindowColor(Color.black);
	}
	void makeFlatHouse(String height) {
		int h=60;
		if(height.equals("large")) {
			h=240;
		}
		robo.move(h);
		robo.turn(90);
		robo.move(25);
		robo.turn(90);
		robo.move(h);
		robo.turn(-90);
		robo.move(25);
		robo.turn(-90);
	}
	void makePointy(String height) {
		int h=60;
		if(height.equals("small")) {
			h=60;
		}
		else if(height.equals("medium")) {
			h=120;
		}
		robo.move(h);
		robo.turn(45);
		robo.move(25);
		robo.turn(90);
		robo.move(25);
		robo.turn(45);
		robo.move(h);
		robo.turn(-90);
		robo.move(25);
		robo.turn(-90);
	
}
}
