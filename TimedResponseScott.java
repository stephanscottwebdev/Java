import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class TimedResponseScott {

	public static void main(String[] args) {
		LocalDateTime time1 = LocalDateTime.now();
		int sec1 = time1.getSecond();
		int min1 = time1.getMinute();
		
		JOptionPane.showConfirmDialog(null, "Are you a closet Taylor Swift fan?");
		
		LocalDateTime time2 = LocalDateTime.now();
		int sec2 = time2.getSecond();
		int min2 = time2.getMinute();
		
		int difference = sec2 - sec1; 
		
		JOptionPane.showMessageDialog(null, "End seconds: " 
		+ sec2 + "\nStart seconds: " + sec1 + "\nIt took " 
		+ difference + " seconds for you to answer."
				+ "\nWas it a difficult decision?");
	}

}
