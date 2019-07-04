public class PE019{
	
	public static void main(String args[]){

		int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = 1;
		int year = 1900;
		int count = 0;
		for (int i = year; i < 2001; i++){
			for (int j = 0; j < 12; j++){
				if (i%4 == 0 && j == 1 && (i%100 != 0 || i%400 == 0)){
					day = (day+months[1]+1)%7;
				}
				else {
					day = (day+months[j])%7;
				}
				if (day == 0 && i > 1900){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}