import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������� ��������� ���-���������� ����� �� ������� �� ��� � ���� �� �� 2 � 3 �����");
		
		System.out.println("�������� ���� �� ����(�� 10 �� 9999 �����)");
		Scanner sc = new Scanner(System.in);
		int volume = sc.nextInt();
		
		if (volume>=10 && volume<=9999) {
			
			int kofi = volume / 5;
			int kofi2 = kofi;
			int kofi3 = kofi;
			int ostatyk = volume % 5;
			if (ostatyk==1) {
				kofi2 = kofi2-1;
				kofi3 = kofi3+1;
				System.out.println("����� �� �� ������� � "+kofi2+" ���� ���� �� �� 2 ����� � "+kofi3+" ���� �� 3 �����");
			}
			else {
				if(ostatyk==2){
					kofi2=kofi2+1;
					System.out.println("����� �� �� ������� � "+kofi2+" ���� ���� �� �� 2 ����� � "+kofi3+" ���� �� 3 �����");		
				}
				else {
					if (ostatyk==3){ 
					kofi3=kofi3+1;
					System.out.println("����� �� �� ������� � "+kofi2+" ���� ���� �� �� 2 ����� � "+kofi3+" ���� �� 3 �����");		
					}
					else {
						if (ostatyk==4) {
							kofi2=kofi2+2;
							System.out.println("����� �� �� ������� � "+kofi2+" ���� ���� �� �� 2 ����� � "+kofi3+" ���� �� 3 �����");
						}
						else {
						System.out.println("����� �� �� ������� � "+kofi2+" ���� ���� �� �� 2 ����� � "+kofi3+" ���� �� 3 �����");		
						}
						}
					}
			}
		}
		else {
			System.out.println("���������� ����� �� � � ���������� ��������");
		}
	}

}
