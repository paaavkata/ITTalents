
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr ={ 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
					 };	
		
		int maxRow = 0;
		int maxCol = 0;
		
		
		for(int i = 0; i < arr.length; i++){
			
			int sumRow = 0;
			int sumCol = 0;
			
			for(int j = 0; j < arr.length; j++){
				sumRow += arr[i][j];
				sumCol += arr[j][i];
			}
			
			if(sumRow > maxRow){
				maxRow = sumRow;
			}
						
			if(sumCol > maxCol){
				maxCol = sumCol;
			}
		}
		System.out.println("������������ ���� �� ������ �: " + maxRow);
		System.out.println("����������� ���� �� ������ �: " + maxCol);
		
		System.out.println(maxRow>maxCol ? "������������ ���� �� ������ � > �� ������������ ���� �� ������" : "������������ ���� �� ������ � < �� ������������ ���� �� ������");
	}

}
