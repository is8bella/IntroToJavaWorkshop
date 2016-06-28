package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare 
{
	// 2. Create a new Robot
	Robot one = new Robot();
	void go() 
	{
		one.penDown();
		// 4. Make the robot move as fast as possible
		one.setSpeed(10);
		// 5. Set the pen width to 5
		one.setPenWidth(1);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 90; i++) 
		{
			// 7. Set the pen color to random
			one.setRandomPenColor();
					// 1. Call the drawSquare() method
			drawSquare();
					// 8. Turn the robot 90 degrees to the right
			one.turn(90);
			one.turn(75);
			one.turn(60);
			one.turn(55);
		}
	}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() 
	{
		for (int i = 0; i < 5; i++) 
		{
			one.move(200);
			one.turn(95);
		}
	}

	public static void main(String[] args) 
	{
		new FourSquare().go();
	}

}
