public class PE012{

	public static void main(String args[]){

		int triangle = 0;
		int factors = 0;
		for(int i = 1; factors < 500; i++){
			triangle += i;
			factors = 0;
			for (int j = 1; j*j <= triangle; j++){
				if (j*j == triangle){
					factors++;
				}
				else if (triangle%j == 0){
					factors += 2;
				}
			}
		}
		System.out.println(triangle);
	}
}