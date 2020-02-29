package _01_houses;

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
		for (int i = 0; i < 3; i++) {
			makeHouse("small");
			makeHouse("medium");
			makeHouse("large");
		}

		
	}
	void makeHouse(String height) {
		int h=60;
		if(height.equals("small")) {
			h=60;
		}
		else if(height.equals("medium")) {
			h=120;
		}
		else {
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
}
