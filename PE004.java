// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.
import java.lang.Math;
public class PE004{

	public static void main(String args[]){
		boolean finished = false;
		int max = 0;
		for (int i = 999; i > 100 && !finished; i--){
			for (int j = 999; j => i && !finished; j--){
				boolean palen = true;
				int mag = (int) Math.log10(i*j);
				for (int k = 0; k < mag/2+1 && palen; k++){
					// System.out.println((i*j)+" "+k+" "+(int)((i*j)/Math.pow(10,mag-k))%10+" "+(int)((i*j)%Math.pow(10,k+1)/Math.pow(10,k)));
					if ((int)((i*j)/Math.pow(10,mag-k))%10 != (int)((i*j)%Math.pow(10,k+1)/Math.pow(10,k))){
						palen = false;
					}
				}
				if (palen){
					if (i*j > max)
					max = i*j;
				}
			}
		}
		System.out.println(max);
	}
}