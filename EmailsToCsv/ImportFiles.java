import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ImportFiles {

	public static void main(String[] args) {
		String charsetName = "Unicode";
		File directory = new File("C:/Users/Pavel Damyanov/Desktop/Folder");
		File files[]= directory.listFiles();
		System.out.println(files[3]);
		InputStream stream = null;
		try {
			stream = new FileInputStream(files[1]);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Scanner sc = new Scanner(stream);
		System.out.println(sc);
//		for (int i = 0; i < 5; i++) {
//			try {
//				Scanner sc = new Scanner(files[i]);
//				System.out.println(sc);
//				while(sc.hasNextLine()) {
//					String line = sc.nextLine();
//					if(line.contains("Date: ")){
//						line.substring(10, 30);
//						System.out.println(line);
//					}
//				}
//
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
	}
	
}
