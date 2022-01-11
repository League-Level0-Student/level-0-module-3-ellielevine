package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String Happy = JOptionPane.showInputDialog("Are You Happy?");
		if (Happy.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		} else if (Happy.equalsIgnoreCase("No")) {
			Happy = JOptionPane.showInputDialog("Do you want to be happy?");
			if (Happy.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else if (Happy.equalsIgnoreCase("No"));
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}

		}
	}

