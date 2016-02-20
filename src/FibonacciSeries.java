
public class FibonacciSeries {
	public static void main(String[] args) {
		int i;
		long a = 0;
		System.out.println(a);
		long b = 1;
		System.out.println(b);
		for (i = 1; i < 92; i++) {
			long c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
