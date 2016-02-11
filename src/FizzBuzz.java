public class FizzBuzz {
	
	public static void main(String[] args) {
		int counter = 0;
		while (counter < 1000000000) {
			counter = counter+1;
			if (counter % 3 == 0 && counter % 5 == 0) {
				System.out.println("fizz buzz");
			}
			else if (counter % 3 == 0) {
				System.out.println("fizz");
			}
			else if (counter % 5 == 0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(counter);
			}
		}
	}
}
