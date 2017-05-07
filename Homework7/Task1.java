
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
		
		System.out.println("Годината на производство на " + pc.name + " е: " + pc.year);
		System.out.println("Преносим ли е: " + (pc.isNotebook ? "ДА" : "НЕ"));
		System.out.println("Цената на " + pc.name + " е: " + pc.price + " лв.");
		System.out.println("Свободната оперативна памет в " + pc.name + " е: " + pc.freeMemory + " MB");
		System.out.println("Операционната система на " + pc.name + " е: " + pc.operationSystem);
		System.out.println("Твърдият диск на " + pc.name + " е с капацитет " + pc.hardDiskMemory + " GB");
		System.out.println();
		System.out.println("Годината на производство на " + notebook.name + " е: " + notebook.year);
		System.out.println("Преносим ли е: " + (notebook.isNotebook ? "ДА" : "НЕ"));
		System.out.println("Цената на " + notebook.name + " е: " + notebook.price + " лв.");
		System.out.println("Свободната оперативна памет в " + notebook.name + " е: " + notebook.freeMemory + " MB");
		System.out.println("Операционната система на " + notebook.name + " е: " + notebook.operationSystem);
		System.out.println("Твърдият диск на " + notebook.name + " е с капацитет " + notebook.hardDiskMemory + " GB");
	
		
	}

}
