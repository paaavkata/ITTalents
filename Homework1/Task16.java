import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ���������� �����");
		int number = sc.nextInt();
		
		int temp3 = number % 10;
		int temp2 = number / 10;
		temp2 = temp2 % 10;
		int temp1 = number / 100;
		
		if(number>=100 && number<1000){
			
			if(temp1 == temp2 && temp2 == temp3){
				System.out.println(temp1+"="+temp2+"="+temp3+" ������� �� �����");
			}
			
				else if(temp1 > temp2 && temp2 > temp3){
					System.out.println(temp1+">"+temp2+">"+temp3+" ������� �� ��� �������� ���");
				}
			
				else if(temp1 < temp2 && temp2 < temp3){
					System.out.println(temp1+"<"+temp2+"<"+temp3+" ������� �� � �������� ���");
				}
			
			else{
				System.out.println("������� �� ����������");
			}
		}
		else{
			System.out.println("���������� ����� �� � ����������");
		}
	}

}
