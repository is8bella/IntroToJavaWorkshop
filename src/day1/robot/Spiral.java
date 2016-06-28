package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral 
{

	public static void main(String[] args) 
	{
		Robot two = new Robot();
		two.setSpeed(10);
		two.penDown();
		for (int j = 0; j < 75; j++) 
		{
			two.move(5*j);
			two.turn(360/7);
			two.setRandomPenColor();
			two.setPenWidth(j);
		}
	}
}
