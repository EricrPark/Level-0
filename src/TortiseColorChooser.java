// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
public class TortiseColorChooser {
	public static void main(String[] args) {
		int banana = 0;
		while (banana == 0){

			String favColor = JOptionPane.showInputDialog("Choose a color black, cyan, green, pink, magenta, blue, yellow, gray, or type anything else for a random color. To quit type: banana");
			//3. ask the user what color they would like the tortoise to draw
			if (favColor.equalsIgnoreCase("BLACK")) {
				Tortoise.setPenColor(Color.black);
			}
			else if (favColor.equalsIgnoreCase("CYAN")) {
				Tortoise.setPenColor(Color.cyan);
			}
			else if (favColor.equalsIgnoreCase("GREEN")) {
				Tortoise.setPenColor(Color.green);
			}
			else if (favColor.equalsIgnoreCase("PINK")) {
				Tortoise.setPenColor(Color.pink);
			}
			else if (favColor.equalsIgnoreCase("MAGENTA")) {
				Tortoise.setPenColor(Color.magenta);
			}
			else if (favColor.equalsIgnoreCase("BLUE")) {
				Tortoise.setPenColor(Color.blue);
			}
			else if (favColor.equalsIgnoreCase("YELLOW")) {
				Tortoise.setPenColor(Color.yellow);
			}
			else if (favColor.equalsIgnoreCase("GRAY")) {
				Tortoise.setPenColor(Color.gray);
			}
			else if (favColor.equalsIgnoreCase("banana")) {
				banana = banana+1;
				break;
			}
			else{
				Tortoise.setPenColor(Colors.getRandomColor());
			}
			//4. use an if/else statement to set the pen color that the user requested

	//5. if the user doesn’t enter anything, choose a random color

	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//2. set the pen width to 10
			for (int i = 0; i < 250; i++) {
				Tortoise.penDown();
				Tortoise.setSpeed(10);
				Tortoise.move(50);
				Tortoise.turn(i*100);
				//Tortoise.move(10);
				//Tortoise.turn(i);
			}
					//1. make the tortoise draw a shape (this will take more than one line of code)


		}
	}

}


 