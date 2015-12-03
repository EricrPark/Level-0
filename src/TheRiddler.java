import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		// 1. Make a variable to hold the score
		String riddle1 = JOptionPane.showInputDialog("What is, but is not. What is on fire, but not on fire. What is over water, but not over water.");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		if (riddle1.equalsIgnoreCase("paradox")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score=score+1;
		}
		else{
			JOptionPane.showMessageDialog(null,"Wrong screw you go home fool learn common riddles before you come to the RRRRIIIIIDDDDLLLLEEEEERRRRR");
			score=score-1;
		}
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		JOptionPane.showMessageDialog(null, "your score is"+score);
		
		// 2. Make a pop up to show the score.
		
	}
}