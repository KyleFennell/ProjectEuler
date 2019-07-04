import java.math.BigInteger;
public class PE020{

	public static void main(String args[]){

		BigInteger fact = BigInteger.ONE;
		for (int i = 2; i < 101; i++){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		String sFact = ""+fact;
		int sum = 0;
		for(int i = 0; i < sFact.length(); i++){
			sum += Integer.parseInt(sFact.substring(i,i+1));
		}
		System.out.println(sum);
	}
}