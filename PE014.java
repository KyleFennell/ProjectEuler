public class PE014{
	
	public static void main(String args[]){
		int maxcount = 0;
		int max = 0;
		for (int i = 1; i < 1000000; i++){
			int count = 0;
			long no = i; 
			while(no != 1){
				no = (no%2==0)?no/2:3*no+1;
				count++;
			}
			if (count > maxcount){
				maxcount = count;
				max = i;
			}
		}
		System.out.println(max);
	}
}