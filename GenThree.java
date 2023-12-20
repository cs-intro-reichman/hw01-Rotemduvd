/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {

		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int dif = Math.abs(a-b);

		int min1 = Math.min(a,b);

		int r1 = min1 + ((int) (dif * Math.random()));
		int r2 = min1 + ((int) (dif * Math.random()));
		int r3 = min1 + ((int) (dif * Math.random()));

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

		int minT = Math.min(r1, Math.min(r2, r3));

		System.out.println("The minimal generated number was " + minT);

	}
}
