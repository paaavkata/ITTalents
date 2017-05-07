
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] arr ={ 
				{99,-87,46,15,17},
				{12,-71,39,41,53},
				{87,90,4,25,-8},
				{-15,95,56,51,56},
				{64,69,83,-73,55},
				{-100,12,28,-18,21}
				 };	
	
	int sum = 0;
	
	int counter = 0;
	
	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < arr[i].length; j++){
			sum += arr[i][j];
			counter++;
		}
	}
	
	double avg = 0;
	
	System.out.println("Сумата на всички числа в масива е: " + sum);
	System.out.println("Средната стойност на числата в масива е: " + avg);
	}

}
