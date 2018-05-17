import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("When is your birthday?");
	
	if (birthday.equals("05/17")){
		JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy unbirthday");
		
	}
	
	
}
}
