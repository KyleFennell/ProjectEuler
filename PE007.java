// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
import java.util.LinkedList;
import java.math.BigInteger;
public class PE007{

	static LinkedList<BigInteger> primes = new LinkedList<BigInteger>();

	public static void main(String args[]){
		primes.add(BigInteger.valueOf(2));
		for (BigInteger i = BigInteger.valueOf(3); primes.size() != 10001; i = i.add(BigInteger.valueOf(2))){
			isPrime(i);
		}
		System.out.println(primes.peekLast());
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