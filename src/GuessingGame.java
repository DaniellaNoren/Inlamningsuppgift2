
public class GuessingGame {

	public static void main(String[] arg) {
		
		int low = 0;
		int high = 0;
		try {
			low = Integer.parseInt(arg[0]);
			high = Integer.parseInt(arg[1]);
		}catch(NumberFormatException e) {
			System.out.println("Not an int");
		}
		Guesser guesser = new Guesser(low, high);
		guesser.start();
		
		
		
	}

}
