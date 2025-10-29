// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int number = Integer.parseInt(args[0]);
		// Extract hundreds, tens, and units using floor division functions
	    int hundreds = (int) Math.floor(number / 100);
	    int tens = (int) Math.floor((number - hundreds * 100) / 10);
	    int units = number % 10;
	    //output
	    System.out.println(hundreds + " hundreds, " + tens +
		                   " tens, and " + units + " ones.");		

	}
}
