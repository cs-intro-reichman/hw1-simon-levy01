// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = ((int) (Math.random()*Integer.parseInt(args[0])));
		int b = ((int) (Math.random()*Integer.parseInt(args[0])));
		int c = ((int) (Math.random()*Integer.parseInt(args[0])));
		int big = Math.max(Math.max(a,b), c); // find biggest integer
		int small = Math.min(Math.min(a,b), c); // find smallest integer
		// find middle integer by finding the 2 biggest numbers, then the smallest of those
		int i = Math.max(a,b);
		int j = Math.max(b,c);
		int k = Math.max(c,a);
		int mid = Math.min(Math.min(i,j),k);
		System.out.println(a + " " + b + " " + c);
		System.out.println(small + " " + mid + " " + big);
	}
}
