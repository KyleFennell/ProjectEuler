import java.util.LinkedList;
import java.math.BigInteger;
public class PE010{

	static LinkedList<BigInteger> primes = new LinkedList<BigInteger>();

	public static void main(String args[]){
		primes.add(BigInteger.valueOf(2));
		for (BigInteger i = BigInteger.valueOf(3); i.compareTo(BigInteger.valueOf(2000000))<0; i = i.add(BigInteger.valueOf(2))){
			isPrime(i);
		}
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger b : primes){
			sum = sum.add(b);
		}
		System.out.println(sum);
	}

	public static boolean isPrime(BigInteger i){
		for (BigInteger l : primes){
			if (i.mod(l).equals(BigInteger.ZERO)){
				return false;
			}
		}
		primes.add(i);
		return true;
	}
}