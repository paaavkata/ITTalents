
public class Task1 {

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
		
		int min = arr[0][0];
		int max = arr[0][0];
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j]>max){
					max = arr[i][j];
				}
				if(arr[i][j]<min){
					min = arr[i][j];
				}
			}
		}
		System.out.println("Максималната стойност в масива е: " + max);
		System.out.println("Минималната стойност в масива е: " + min);
//		System.out.println("Вашата таблица изглежда по следния начин:");
//
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr[i].length; j++){
//				if(j == arr[i].length-1){
//					System.out.println(arr[i][j]);
//				}
//				else{
//					System.out.print(arr[i][j] + ", ");
//				}
//			}
//			System.out.println();
//		}
	}

}


