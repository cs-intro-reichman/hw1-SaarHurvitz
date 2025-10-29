// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	
	    int bill = Integer.parseInt(args[3]);
	    //Divides the bill value to 3 and rounds up
	    bill = (int) Math.ceil((double)bill/3); 
	    //output
	    System.out.println(args[2] + ", " + args[1] + ", and " + args[0] + 
		                   ": pay " + (double)bill + " Shekels each.");
						   //BTW Iknow how to make a scanner but the assignment said to use args

	}
}
