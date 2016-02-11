import org.teachingextensions.logo.Tortoise;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		String shape = JOptionPane.showInputDialog("Enter what shape you want-- circle square triangle");
		JOptionPane.showMessageDialog(null, "YOU GET A CIRCLE!");
		//drawSquare();
		//drawTriangle();
		drawCircle();
	}

	private static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}

	private static void drawTriangle() {
		Tortoise.turn(30);
		for (int i = 0; i < 3; i++) {
			Tortoise.move(70);
			Tortoise.turn(120);
		}
	}

	private static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(70);
			Tortoise.turn(90);
			
		}
	}
	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
