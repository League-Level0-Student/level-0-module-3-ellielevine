
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String cats = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		int numcats = Integer.parseInt(cats);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(numcats >= 3) {
			JOptionPane.showMessageDialog(null, "You're a crazy cat lady");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		else if(numcats<3 && numcats>0) {
			playVideo("This is a cat video");
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		else if(numcats==0) {
		playVideo("This is a frog");
		}
		
		
		
		
	}

	static void playVideo(String video) {
		JOptionPane.showMessageDialog(null, video);
//		try {
//			URI uri = new URI(videoURL);
//			java.awt.Desktop.getDesktop().browse(uri);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}

