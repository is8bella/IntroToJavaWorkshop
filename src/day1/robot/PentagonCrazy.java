package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy 
{

	private void makePrettyThings() 
	{
		Robot three = new Robot();
		three.setSpeed(100);
		three.penDown();
		three.setPenColor(0, 0, 0);
		int dist = 200;
		int side = 34;
		int angle = 360/side;
		for (int i = 0; i < 900; i++) 
		{
			three.move(dist);
			three.turn(angle);
			three.turn(1);
		}
	}



	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}