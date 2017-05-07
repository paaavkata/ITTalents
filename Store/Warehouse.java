import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class Warehouse {

	private HashMap<String, HashMap<String, Integer>> products;
	private static final int MINIMUM_QTY = 5;
	public Warehouse() {
		products = new HashMap<String, HashMap<String, Integer>>();
		products.put("Fruits", new HashMap<String, Integer>());
		products.put("Vegetables", new HashMap<String, Integer>());
		products.put("Meats", new HashMap<String, Integer>());
		products.get("Fruits").put("Banana", 15);
		products.get("Fruits").put("Orange", 15);
		products.get("Fruits").put("Apple", 15);
		products.get("Vegetables").put("Potato", 15);
		products.get("Vegetables").put("Eggplant", 15);
		products.get("Vegetables").put("Cucumber", 15);
		products.get("Meats").put("Pork", 15);
		products.get("Meats").put("Beef", 15);
		products.get("Meats").put("Chicken", 15);
		
	}
	
	public synchronized void addProducts(){
		for(HashMap<String, Integer> e : products.values()){
			for(String name : e.keySet()){
				if(e.get(name) < MINIMUM_QTY){
					e.put(name, e.get(name)+25);
				}
			}
		}
	}
	
	public void sendProducts(String type){
		
	}
}
