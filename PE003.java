// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
import java.util.ArrayList;
import java.math.BigInteger;
public class PE003{

	static ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
	
	public static void main(String args[]){

		BigInteger no = new BigInteger("600851475143");
		BigInteger max = BigInteger.ONE;
		BigInteger prime = null;
		primes.add(BigInteger.valueOf(2));
		for (BigInteger i = BigInteger.valueOf(3); no.compareTo(max) != 0; i = i.add(BigInteger.valueOf(2))){
			if (isPrime(i)){
				if (no.mod(i).equals(BigInteger.ZERO)){
					BigInteger j = i;
					while (no.mod(j).equals(BigInteger.ZERO)){
						max = max.multiply(j);
						j = j.add(i);
					}
					prime = i;
				}
			}
		}
		System.out.println(prime);
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