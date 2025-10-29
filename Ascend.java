// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int ascend = Integer.parseInt(args[0]);
		//generates 3 random numbers
		int rnd1 = (int)(Math.random() * (ascend+1));
		int rnd2 = (int)(Math.random() * (ascend+1));
		int rnd3 = (int)(Math.random() * (ascend+1));
		//choosing the smallest value and puts it in small3 variable
		int small1 = Math.min(rnd1, rnd2);
		int small2 = Math.min(rnd2, rnd3);
		int small3 = Math.min(small1, small2);
		//choosing the biggest value and puts it in big3 variable
		int big1 = Math.max(rnd1, rnd2);
		int big2 = Math.max(rnd2, rnd3);
		int big3 = Math.max(big1, big2);
		//calculating the sum and subtracting the big and the small to find the mid value
		int mid = rnd1 + rnd2 + rnd3 - small3 - big3;
		
		System.out.println(rnd1 + " " + rnd2 + " " + rnd3);
		System.out.println(small3 + " " + mid + " " + big3);

	}
}
