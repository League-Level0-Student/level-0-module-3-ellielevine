package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Your alarm clock rings, should you get ready for school?");
		if (answer.equalsIgnoreCase("yes")) {
			String prepare = JOptionPane.showInputDialog("Do you want to shower or just get dressed?");
			if (prepare.equalsIgnoreCase("shower")) {
				JOptionPane.showMessageDialog(null, "You shower and get prepared for school");
			} else if (prepare.equalsIgnoreCase("just get dressed")) {
				JOptionPane.showMessageDialog(null, "You get dressed and get ready for school");
			} else {
				JOptionPane.showMessageDialog(null, "You go to school in your pajamas");
			}
		} else if (answer.equalsIgnoreCase("No")) {
			String sleep = JOptionPane
					.showInputDialog("Do you want to sleep in or wake up now that you are running a bit late?");
			if (sleep.equalsIgnoreCase("wake up now")) {
				JOptionPane.showMessageDialog(null,
						"You wake up and go to school sloppy and sleepy from trying to ignore your alarm");
			} else if (sleep.equalsIgnoreCase("sleep in")) {
				JOptionPane.showMessageDialog(null, "Uh Oh! You slept in late and ended up missing school!");
			} else {
				JOptionPane.showMessageDialog(null,
						"You go to school late, but luckily you don't miss all of your classes");
			}
		}
	}
}
