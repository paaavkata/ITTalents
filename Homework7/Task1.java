
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer();
		pc.name = "Apple Mac";
		pc.year = 2016;
		pc.isNotebook = false;
		pc.price = 3499;
		pc.freeMemory = 2000;
		pc.hardDiskMemory = 500;
		pc.operationSystem = "Windows 7";
		
		Computer notebook = new Computer();
		notebook.name = "Acer Aspire V Nitro";
		notebook.year = 2017;
		notebook.isNotebook = true;
		notebook.price = 1499;
		notebook.freeMemory = 4000;
		notebook.hardDiskMemory = 1000;
		notebook.operationSystem = "Linux Slackware 10";
		
		pc.changeOperationSystem("Windows 10");
		notebook.useMemory(100);
		notebook.changeOperationSystem("Linux Slackware 11");
		
		System.out.println("�������� �� ������������ �� " + pc.name + " �: " + pc.year);
		System.out.println("�������� �� �: " + (pc.isNotebook ? "��" : "��"));
		System.out.println("������ �� " + pc.name + " �: " + pc.price + " ��.");
		System.out.println("���������� ���������� ����� � " + pc.name + " �: " + pc.freeMemory + " MB");
		System.out.println("������������� ������� �� " + pc.name + " �: " + pc.operationSystem);
		System.out.println("�������� ���� �� " + pc.name + " � � ��������� " + pc.hardDiskMemory + " GB");
		System.out.println();
		System.out.println("�������� �� ������������ �� " + notebook.name + " �: " + notebook.year);
		System.out.println("�������� �� �: " + (notebook.isNotebook ? "��" : "��"));
		System.out.println("������ �� " + notebook.name + " �: " + notebook.price + " ��.");
		System.out.println("���������� ���������� ����� � " + notebook.name + " �: " + notebook.freeMemory + " MB");
		System.out.println("������������� ������� �� " + notebook.name + " �: " + notebook.operationSystem);
		System.out.println("�������� ���� �� " + notebook.name + " � � ��������� " + notebook.hardDiskMemory + " GB");
	
		
	}

}
