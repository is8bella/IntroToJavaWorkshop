import org.jointheleague.graphical.robot.Robot;

public class RobotTest 
{
	public static void main(String[] args) 
	{
		Robot one = new Robot();
		one.setSpeed(20);
		one.penDown();
		one.setPenColor(0, 0, 100);
		for (int i = 0; i < 4; i++) 
		{
			one.move(-200);
			one.turn(90);
		}
		/*
		one.move(-200);
		one.turn(90);
		one.move(-200);
		one.turn(90);
		one.move(-200);
		one.turn(90);
		one.move(-200);
		one.turn(90);
		one.move(-400);
		one.turn(90);
		one.move(-200);
		one.turn(90);
		one.move(-600);
		one.turn(90);
		one.move(-200);
		one.turn(90);
		one.move(-200);
		one.turn(-90);
		one.move(-200);
		one.turn(90);
		one.move(-200);
		one.turn(90);
		one.move(-600);
		one.turn(90);
		one.move(-200);
		one.turn(90);
		one.move(-600);
		one.turn(-90);
		one.move(-200);
		*/
	}
}
