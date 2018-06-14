//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String jacob = "speaks to animals";
		String ayden = "laser eyes";
		String tam = "power over cats";
		String reyna = "invisibility";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Enter a name of someone at your table");
		if (name.equals("jacob")) {
			JOptionPane.showMessageDialog(null, jacob);
		}
		else if (name.equals("ayden")) {
			JOptionPane.showMessageDialog(null, ayden);
		}
		else if(name.equals("tam")) {
			JOptionPane.showMessageDialog(null, tam);
		}
		else if(name.equals("reyna")) {
			JOptionPane.showMessageDialog(null, reyna);
			
			// 3. Show the superpower in a pop-up, depending on the name entered.

		}
	}
}
