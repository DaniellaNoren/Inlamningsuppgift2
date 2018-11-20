
public class TestGuesser {

	public static void main(String[] args) {
		constructorTest();

	}
	public static void constructorTest() {
		try {
		Guesser guesser1 = new Guesser(1, 1000);
		Guesser guesser2 = new Guesser(44, 44);
		Guesser guesser3 = new Guesser(-4, 600);
		System.out.println("Constructor-Test 1 passed, no exception thrown!");
		}catch(IllegalArgumentException e ) {
			System.out.println("Constructor-Test 1 failed, exception thrown when it shouldn't");
		}
		try {
	    Guesser guesser1 = new Guesser(5, 2);
	    assert false : "Constructor-Test 2 failed, no exception thrown!";
	    Guesser guesser2 = new Guesser(0, -3);
	    assert false : "Constructor-Test 2 failed, no exception thrown!";	
		}catch(IllegalArgumentException e) {
			System.out.println("Constructor-Test 2 passed, exception thrown when it should!");
		}
	
		
		
	}
	
	public void toStringTest() {
		
		
	}

}
