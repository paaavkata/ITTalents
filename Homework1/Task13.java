import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �������� ����������� � ������ � ��������� �� -100 �� +100 �������");
		int temp = sc.nextInt();
		
		if(temp>=-100 && temp<=100){
			if(temp<=-20){
				System.out.println("������ �������");
			}
			else{
				if(temp<=0){
					System.out.println("�������");
				}
				else{
					if(temp<=15){
						System.out.println("������");
					}
					else{
						if(temp<=25){
							System.out.println("�����");
						}
						else{ 
							System.out.println("������");
						}
					}
				}
			}
		}
		else{
			System.out.println("���������� ����� �� � � ���������� ��������!");
		}
	}

}
