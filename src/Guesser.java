import java.io.Console;
import java.util.Scanner;

public class Guesser{
  private int low;
  private int high;

  public Guesser(int low, int high) {
	  if(low <= high)
		  this.low = low;
	  else
		  throw new IllegalArgumentException("Low can't be a higher number than High");
	  if(high >= low)
		  this.high = high;
	  else
		  throw new IllegalArgumentException("High can't be a lower number than Low");
  }

  public void start(){
    rules();
    doGuesses();
  }

  private void rules(){
    System.out.println("Think of a number between " +
                       low + " and "  + high);
    System.out.println("I'm going to ask a few questions in order " +
                       "to guess the number.");
    System.out.println("Please answer T for true, and F for false.\n");
  }

  private String getReply(){
	Scanner sc = new Scanner(System.in);
	String reply = "";
	reply = sc.nextLine();

    while(!(reply.equalsIgnoreCase("T") || reply.equalsIgnoreCase("F"))) {
      System.out.println("Please answer \"T\" or \"F\"\nTry again:"); 	
      reply = sc.nextLine();
    }
    return reply;
  }

  private void doGuesses(){
    int i=0; 
    int middle=0;
    while(low<high){
      middle=low + (high-low)/2;

      System.out.println("Is the number less than or equal to " +
                         middle + "?");
      String reply = getReply();
      if("T".equalsIgnoreCase(reply)){
        high = middle;
      }else{
        low = middle + 1;
      }
      i++; 
    }

    answer(low, i);
  }

  private void answer(int guess, int numberOfGuesses){
    System.out.println("You were thinking about " +
                       guess +
                       " (took me " + numberOfGuesses +
                       " guesses)");
  }
  
  public String toString() {
	  return "Low="+low+", High="+high;
  }

}
