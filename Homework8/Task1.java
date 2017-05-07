
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer(2016, 3499, 500, 2000);
		pc.name = "Apple Mac";		
		Computer notebook = new Computer();
		notebook.name = "Acer Aspire V Nitro";
		notebook.year = 2017;
		notebook.isNotebook = true;
		notebook.price = 1499;
		notebook.freeMemory = 4000;
		notebook.hardDiskMemory = 1000;
		notebook.operationSystem = "Linux Slackware 10";

		Computer gaming = new Computer(2017, 6999, false, 8000, 16000, "Windows 10 Pro");
		gaming.name = "Dell Alienware";
		int compare1 = pc.comparePrice(notebook);
		int compare2 = pc.comparePrice(gaming);
		int compare3 = gaming.comparePrice(notebook);	
		print(compare1);
		print(compare2);
		print(compare3);
		pc.compareConclusion(notebook);
		pc.compareConclusion(gaming);
		gaming.compareConclusion(notebook);
	}
	
	public static void print(int number){
		if(number == 1){
			System.out.println("Компютърът е по-евтин");
		}
		if(number == 0){ 
			System.out.println("Цените са равни");
		}
		if(number == -1){
			System.out.println("Компютърът е по-скъп");
		}
	}

}
