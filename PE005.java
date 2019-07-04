// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class PE005{

	public static void main(String args[]){

		long max = Long.MAX_VALUE;
		System.out.println(max);
		for (int i = 16628040; i < max; i += 19){
			for (int j = 1; j <= 20; j++){
				if (i%j != 0){
					break;
				}
				if(j == 20){
					System.out.println(i);
					System.exit(0);
				}
			}
		}
	}
}