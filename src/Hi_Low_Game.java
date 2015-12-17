import java.util.Random;

import javax.swing.JOptionPane;
public class Hi_Low_Game {
	public static void main(String[] args) {
		int count = 0;
		Random r = new Random(); 
		int num = r.nextInt(100);
		System.out.println(num); 
		int countGuess = 0;
		while (count < 1) {
			String inputGuess = JOptionPane.showInputDialog("Enter a number between 0-99");
			countGuess = countGuess+1;
			int guess = Integer.parseInt(inputGuess);
			if (countGuess == 10) {
				JOptionPane.showMessageDialog(null,"You took too many guesses you LOSE! Total guesses:10");
				count = count+1;
			}
			else if (num == guess) {
				count = count+1;
				JOptionPane.showMessageDialog(null,"Good Job! You got it right! It took you " +countGuess+ " guesses.");
			}
			else if (num > guess) {
				JOptionPane.showMessageDialog(null,"Your guess was to low");
			}
			else if (num < guess) {
				JOptionPane.showMessageDialog(null,"Your guess was to high");
			}
		}
	}
}
