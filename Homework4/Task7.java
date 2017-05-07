
public class Task7 {
	public static void main(String[] args) {
		
		int[][] arr ={ 
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
					 };	
		
		int sumRow = 0;
		int row = 0;
		for(int i = 0; i < arr.length; i++){
			row = 0;
			for(int j = 0; j < arr[i].length; j++){
								
				if((i + j) % 2 == 0){
					row += arr[i][j];
					if(j < arr[i].length-1){
						if(i % 2 == 0 && j == arr[i].length-2){
							System.out.print(arr[i][j] + "; Сума на елементите от реда: " + row);
						}
						else{
							System.out.print(arr[i][j] + ", ");
						}
					}
					else{
						System.out.print(arr[i][j] + "; Сума на елементите от реда: " + row);
					}
					
					
				}
				
				
				
			}
			sumRow += row;
			System.out.println();
		}
		System.out.println();	
		System.out.println("Сума на елементите: "+sumRow);
	}
}
