// The sum of the squares of the first ten natural numbers is,
// 12 + 22 + ... + 102 = 385
// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)2 = 552 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
import java.math.BigInteger;
public class PE006{

	public static void main(String args[]){

		int sum = 0;
		BigInteger sqrsum = BigInteger.ZERO;

		for (int i = 0; i <= 100; i++){
			sum += i;
			sqrsum = sqrsum.add(BigInteger.valueOf(i*i));
		}
		System.out.println(sqrsum);
		System.out.println((BigInteger.valueOf(sum).multiply(BigInteger.valueOf(sum))).subtract(sqrsum));

	}
}