// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	 int number = Integer.parseInt(args[0]);
	 int dig1 = number/100;
	 int dig2 = (Math.floorMod(number, 100))/10;
	 int dig3 = Math.floorMod(number, 10);
	 System.out.println(dig1 + " hundreds, " + dig2 + " tens, and " + dig3 + " ones.");


	}
}
