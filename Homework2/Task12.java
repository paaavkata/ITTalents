
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=102; i<=987; i++){
			int temp1 = i % 10;
			int temp10 = i% 100;
			temp10 = temp10 / 10;
			int temp100 = i / 100;
			if(temp100 != temp10){
				if(temp100 != temp1){
					if(temp10 != temp1){
						System.out.println(i);
					}
				}
			}
				
			
		}
	}

}
