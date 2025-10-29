// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		//getting the values of money, interest rate and years into variables
	    int money = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
	    int years = Integer.parseInt(args[2]);
		// Compund interest formula into double variable
		double fv = money * Math.pow((1 + interest/100), years);
		//output
		System.out.println("after " + years + " years " + "$" + money + " saved at " 
		                   + interest + " %is worth: $" + (int)fv);
		
	}
}