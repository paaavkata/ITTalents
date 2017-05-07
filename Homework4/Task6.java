
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
								
				if(i % 2 == 1){
					if(j < arr[i].length-1){
						System.out.print(arr[i][j] + ", ");
					}
					else{
						System.out.print(arr[i][j]);
					}
					row += arr[i][j];
					if(j == arr[i].length-1){
						System.out.print(" сума " + row);
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
