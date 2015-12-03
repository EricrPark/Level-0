// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class Geeks_of_X {
public static void main(String[] args) {
	String mySuper = "My superpower is blinking very fast with skillz";
	String ariaSuper = "Aria's superpower is invisibility because he is invisible and a patato. Invisibility + patato = invisible patatoe";
	String lucasSuper = "Lucas' superpower is ghost-ability and looking awesome...        oooooooooHhhhhhHH do not Get_ReKT m8";
	String jamesSuper = "James' superpower is flying as a banana ugly...        oooooooooHhhhhhHH Get_ReKT m8 lel";
	String chloeSuper = "Chloe's superpower is shapshifting like a hat with a hole";
	String conradSuper = "Conrad's superpower is superspeed and superheed.. wait... huh... what does that mean?s";
	String casySuper = "Casy's superpower is to be an averge citizen cause hes an average joe";
	String betsySuper = "Betsy's superpower is drinking tea see";
		// 1. Save the superpower for each person in a variable.
	String name = JOptionPane.showInputDialog("Enter Your Name");
		// 2. Ask the user to enter a name. Store their answer in a variable.
	if (name.equalsIgnoreCase("eric")) {
		JOptionPane.showMessageDialog(null,mySuper);
		speak(mySuper);
	}
	else if (name.equalsIgnoreCase("aria")) {
		JOptionPane.showMessageDialog(null,ariaSuper);
		speak(ariaSuper);
	}
	else if (name.equalsIgnoreCase("lucas")) {
		JOptionPane.showMessageDialog(null,lucasSuper);
		speak(lucasSuper);
	}
	else if (name.equalsIgnoreCase("james")) {
		JOptionPane.showMessageDialog(null,jamesSuper);
		speak(jamesSuper);
	}
	else if (name.equalsIgnoreCase("chloe")) {
		JOptionPane.showMessageDialog(null,chloeSuper);
		speak(chloeSuper);
	}
	else if (name.equalsIgnoreCase("casy")) {
		JOptionPane.showMessageDialog(null,casySuper);
		speak(casySuper);
	}
	else if (name.equalsIgnoreCase("conrad")) {
		JOptionPane.showMessageDialog(null,conradSuper);
		speak(conradSuper);
	}
	else if (name.equalsIgnoreCase("betsy")) {
		JOptionPane.showMessageDialog(null,betsySuper);
		speak(betsySuper);
	}
	else{
		JOptionPane.showMessageDialog(null,"You have no power and you have no life");
		speak("You have no power and you have no life");
	}
}

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}





		// 3. Show the superpower in a pop-up, depending on the name entered. 

}}