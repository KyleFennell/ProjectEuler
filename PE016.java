import java.math.BigInteger;
public class PE016{

	public static void main(String args[]){
		BigInteger no = BigInteger.valueOf(2);
		no = no.pow(1000);
		String noString = no.toString();
		System.out.println(noString);
		int sum = 0;
		for (int i = 0; i < noString.length(); i++){
			sum += Integer.parseInt(noString.substring(i,i+1));
		}
		System.out.println(sum);
	}
}