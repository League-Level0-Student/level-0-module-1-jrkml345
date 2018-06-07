import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog(
				"You're a bus driver. 39 people got in the bus. Then 4 people got out. How old is the bus driver?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("13")) {
			JOptionPane.showMessageDialog(null, "Yesssss");
			score = score + 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("what kind of pig does karate?" );
if(answer.equals(pork chop)) {
	JOptionPane.showMessageDialog(null, "Thats right!!!");
		
}
else {
		JOptionPane.showMessageDialog(null, "sorry wrong answer");

	}
JOptionPane.showMessageDialog(null,"congrats, your score is "+score );
}
