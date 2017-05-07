import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import java.util.Map.Entry;


public class Letters {
	
	public static void main(String[] args) {
		String text = new String();
		System.out.println("Въведете текст за сканиране");
		Scanner scan = new Scanner(System.in);
		text = scan.nextLine();
		text = text.toUpperCase();
		String length = text.replaceAll("\\s","");
		int lettersCount = length.length(); 
		TreeMap<Character, Integer> stats = checker(text);
		Map<Character, Integer> stats1 = sortByValues(stats);
		printResult(stats1, lettersCount);
	
	}
	
	static TreeMap<Character, Integer> checker(String text){
		TreeMap<Character, Integer> table = new TreeMap<Character, Integer>();
		char letter;
		for (int i = 0; i < text.length(); i++) {
			letter = text.charAt(i);
			if(table.containsKey(letter) || text.charAt(i) < 'A' || text.charAt(i) > 'Z'){
				continue;
			}
			else{
				table.put(letter, 0);
				int temp;
				for (int j = 0; j < text.length(); j++) {
					if(text.charAt(j) == letter){
						table.put(letter, new Integer(table.get(letter).intValue()+1));
					}
				}
			}
		}
		return table;
	}
	
	static <Character, Integer extends Comparable<Integer>> Map<Character, Integer> sortByValues(final Map<Character, Integer> map) {
	    Comparator<Character> valueComparator =  new Comparator<Character>() {
	        public int compare(Character о1, Character о2) {
	            int compare = map.get(о2).compareTo(map.get(о1));
	            if (compare == 0) return 1;
	            else return compare;
	        }
	    };
	    Map<Character, Integer> sortedByValues = new TreeMap<Character, Integer>(valueComparator);
	    sortedByValues.putAll(map);
	    return sortedByValues;
	}
	
	static void printResult(Map<Character, Integer> stats, int length){
		System.out.println("Most common letters:");
		System.out.println();
		for (Entry<Character, Integer> element : stats.entrySet()) {
			if(element.getValue() > 9){
				System.out.println(element.getKey() + ": " + element.getValue() + " " + printDiezi(element.getValue(), length));
			}
			else{
				System.out.println(element.getKey() + ":  " + element.getValue() + " " + printDiezi(element.getValue(), length));
			}
		}
	}
	
	static String printDiezi(int number, int length){
		double percent = ((double)number / (double)length)*100;
		int count = (int)percent;
		String diezi = new String();
		for (int i = 0; i < count; i++) {
			diezi += "#";
		}
		
		return diezi;
	}
	
}
