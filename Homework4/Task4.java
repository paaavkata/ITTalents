
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr ={ 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
					 };	
		
		
		System.out.println("Първообразът на матрицата изглежда по следния начин:");

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(j == arr[i].length-1){
					System.out.println(arr[i][j]);
				}
				else{
					System.out.print(arr[i][j] + ", ");
				}
			}
			System.out.println();
		}
		
		int[][] arr1 = new int[arr[0].length][arr.length];
		
		System.out.println("След завъртане на 90 градуса наляво матрицата изглежда по следния начин:");

		for(int i = 0; i < arr1.length; i++){
			for(int j = 0; j < arr1[i].length; j++){
				arr1[i][j] = arr[j][arr1.length - 1 - i];
				if(j == arr1[i].length-1){
					System.out.println(arr1[i][j]);
				}
				else{
					System.out.print(arr1[i][j] + ", ");
				}
			}
			System.out.println();
		}
		
		int[][] arr2 = new int[arr[0].length][arr.length];
		
		System.out.println("След завъртане на 90 градуса надясно матрицата изглежда по следния начин:");

		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr2[i].length; j++){
				arr2[i][j] = arr[arr2.length - 1 - j][i];
				if(j == arr2[i].length-1){
					System.out.println(arr2[i][j]);
				}
				else{
					System.out.print(arr2[i][j] + ", ");
				}
			}
			System.out.println();
		}
	
	}

}
