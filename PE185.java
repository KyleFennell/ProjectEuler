public class PE185{
	public static boolean possibilities[][] = new int[16][10];
	public staticint dataset[][] = 
					{   {5, 6, 1, 6, 1, 8, 5, 6, 5, 0, 5, 1 ,8 ,2, 9, 3},
						{3, 8, 4, 7, 4, 3, 9, 6, 4, 7, 2, 9 ,3 ,0, 4, 7},
						{5, 8, 5, 5, 4, 6, 2, 9, 4, 0, 8, 1 ,0 ,5, 8, 7},
						{9, 7, 4, 2, 8, 5, 5, 5, 0, 7, 0, 6 ,8 ,3, 5, 3},
						{4, 2, 9, 6, 8, 4, 9, 6, 4, 3, 6, 0 ,7 ,5, 4, 3},
						{3, 1, 7, 4, 2, 4, 8, 4, 3, 9, 4, 6 ,5 ,8, 5, 8},
						{4, 5, 1, 3, 5, 5, 9, 0, 9, 4, 1, 4 ,6 ,1, 1, 7},
						{7, 8, 9, 0, 9, 7, 1, 5, 4, 8, 9, 0 ,8 ,0, 6, 7},
						{8, 1, 5, 7, 3, 5, 6, 3, 4, 4, 1, 1 ,8 ,4, 8, 3},
						{2, 6, 1, 5, 2, 5, 0, 7, 4, 4, 3, 8 ,6 ,8, 9, 9},
						{8, 6, 9, 0, 0, 9, 5, 8, 5, 1, 5, 2 ,6 ,2, 5, 4},
						{6, 3, 7, 5, 7, 1, 1, 9, 1, 5, 0, 7 ,7 ,0, 5, 0},
						{6, 9, 1, 3, 8, 5, 9, 1, 7, 3, 1, 2 ,1 ,3, 6, 0},
						{6, 4, 4, 2, 8, 8, 9, 0, 5, 5, 0, 4 ,2 ,7, 6, 8},
						{2, 3, 2, 1, 3, 8, 6, 1, 0, 4, 3, 0 ,3 ,8, 4, 5},
						{2, 3, 2, 6, 5, 0, 9, 4, 7, 1, 2, 7 ,1 ,4, 4, 8},
						{5, 2, 5, 1, 5, 8, 3, 3, 7, 9, 6, 4 ,4 ,3, 2, 2},
						{1, 7, 4, 8, 2, 7, 0, 4, 7, 6, 7, 5 ,8 ,2, 7, 6},
						{4, 8, 9, 5, 7, 2, 2, 6, 5, 2, 1, 9 ,0 ,3, 0, 6},
						{3, 0, 4, 1, 6, 3, 1, 1, 1, 7, 2, 2 ,4 ,6, 3, 5},
						{1, 8, 4, 1, 2, 3, 6, 4, 5, 4, 3, 2 ,4 ,5, 8, 9},
						{2, 6, 5, 9, 8, 6, 2, 6, 3, 7, 3, 1 ,6 ,8, 6, 7}}
	public static int correct[] = {2, 1, 3, 3, 3, 1, 2, 3, 1, 2, 3, 1, 1, 2, 0, 2, 2, 3, 1, 3, 3, 2};
	public static int clues[] = {16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};
	public static int certainties = 0;
	public static int solution[] = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	public static void main(String args[]){
		for (int i = 0; i < 16; i++){
			possibilities[i] = {true, true, true, true, true, true, true, true, true, true};
		}
		while(certainties != 16){
			for (int i = 0; i < 22; i++){
				if (correct[i] == 0){
					for (int j = 0; j < 16; j++){
						possibilities[dataset[i][j]] = false;
					}
				}
			}
			for (int i = 0; i < 16; i++){
				if (posCount(i) == 1){
					for (int j = 0; j < 22; j++){

					}
				}
			}
		}
	}

	public static void updatePossibilities(){
		for (int i = 0; i < 22){
			for (int j = 0; j < 16){
				if (dataset[i][j] && !possibilities[j][dataset[i][j]]){
					dataset[i][j] = -1;
					clues[i]--;
				}
			}
		}
	}

	public static int posCount(int index){
		int count = 0;
		for (int i = 0; i < 10){
			if (possibilities[index][i])
			count++;
		}
		return count;
	}
}