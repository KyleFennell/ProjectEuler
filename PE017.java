public class PE017{

	public static void main(String args[]){
		int digit[] = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8};
		int tens[] = {0, 3, 6, 6, 5, 5, 5, 7, 6, 6};
		int hundred = 7;
		int and = 3;
		int thousand = 8;
		int sum = 0;
		for (int i = 1; i < 1000; i++){
			int no = i;
			if (no/100 != 0){
				sum += digit[no/100] + hundred;
				if (no%100 != 0){
					sum += and;
				}
			}
			if (no%100 < 20){
				sum += digit[no%100];
			}
			else {
				System.out.println(no%100/10);
				sum += tens[no%100/10] + digit[no%10];
			}
		}
		sum += digit[1] + thousand;
		System.out.println(sum);
	}
}