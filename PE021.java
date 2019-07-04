// Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
// If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
// For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
// Evaluate the sum of all the amicable numbers under 10000.
import java.util.LinkedList;
import java.lang.Math;
public class PE021{
	public static LinkedList<Integer> amicables = new LinkedList<Integer>();

	public static void main(String args[]){
		int sum = 0;
		for (int i = 1; i < 10000; i++){
			// System.out.println(i+" "+d(d(i)));
			if (d(d(i)) == i && d(i) != i){
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static int d(int no){
		int sum = 0;
		int root = (int)Math.floor(Math.sqrt(no));
		// String out = ""+no+" ";
		for (int i = 1; i <= root; i++){
			if (no%i == 0){
				sum += i + no/i;
				// out += i+" "+no/i+" ";
			}
		}
		if (root*root == no){
			sum += root;
			// out += root;
		}
		// System.out.println(out);
		return sum - no;
	}
}