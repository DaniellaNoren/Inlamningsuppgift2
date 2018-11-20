
public class GuessingGame {

	public static void main(String[] arg) {
		
	
		try {
			int low = Integer.parseInt(arg[0]);
			int high = Integer.parseInt(arg[1]);
			
			Guesser guesser = new Guesser(low, high);
		    guesser.start();
		
		}catch(NumberFormatException e) {
			System.out.println("Not a number");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter two numbers next time");
		}
		
		
		
		
		
		
	}

}
