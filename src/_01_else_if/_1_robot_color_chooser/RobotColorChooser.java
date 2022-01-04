
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot robot = new Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		robot.setSpeed(500);
		robot.penDown();
		for (int i = 0; i < 3; i++) {
			robot.move(150);
			robot.turn(120);
		}
		// 3. Set the pen width to 10
		robot.setPenWidth(10);
		// 4. Ask the user what color pen they would like the robot to draw with
		String color = "";
		while (!color.equalsIgnoreCase("quit")) {

			color = JOptionPane.showInputDialog("What color pen would you like to draw with?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if(color.equalsIgnoreCase("quit")) {
				break;
			}
			if (color.equalsIgnoreCase("red")) {
				robot.setPenColor(Color.red);
			} else if (color.equalsIgnoreCase("orange")) {
				robot.setPenColor(Color.orange);
			} else if (color.equalsIgnoreCase("yellow")) {
				robot.setPenColor(Color.yellow);
			} else if (color.equalsIgnoreCase("green")) {
				robot.setPenColor(Color.green);
			} else if (color.equalsIgnoreCase("blue")) {
				robot.setPenColor(Color.blue);
			} else if (color.equalsIgnoreCase("pink")) {
				robot.setPenColor(Color.pink);
			} else {
				robot.setRandomPenColor();
			}
			
			robot.setSpeed(500);
			robot.penDown();
			for (int i = 0; i < 3; i++) {
				robot.move(150);
				robot.turn(120);
			}

			// 6. If the user doesn't enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

		}

	}
}
