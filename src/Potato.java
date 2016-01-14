
public class Potato {
		public static void main(String[] args) {
			String x = "potato";
			for (int i = 0; i < 9; i++) {
				if (i == 4) {
					speak(i+"");
				}
				else if (i < 4 && i > 8) {
					speak(i+x);
				}
				else {
					speak("more");
				}
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

