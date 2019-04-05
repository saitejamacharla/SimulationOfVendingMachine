import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;

//import org.json.simple.JSONObject;
public class MainClass {

	private String[] tableDatas;
	
	public MainClass() {
		
	}
	
	/*public MainClass(int itemId,String itemName,float itemPrice) {
	    this.itemId = itemId;
	    this.itemName = itemName;
	    this.itemPrice= itemPrice;
	}*/
	
	
	public static void main(String[] args){
		Hashtable<String,String> vendingMachineData = new Hashtable<String,String>();
		vendingMachineData.put("1", "1.3");
		vendingMachineData.put("2", "1.5");
		vendingMachineData.put("3", "0.8");
		vendingMachineData.put("4", "1.8");
		vendingMachineData.put("5", "1.2");
		for(String item: vendingMachineData.keySet()){
			System.out.println(item);
			System.out.println(vendingMachineData.get(item));
		}
		/*itemsData itemsData[] = new itemsData[5];
		itemsData[0] = new itemsData(1,"Chocolate",1.25);
		itemsData[1] = new itemsData(2,"Chips",1.5);
		itemsData[2] = new itemsData(2,"Water",0.75);
		itemsData[3] = new itemsData(2,"Coke",1.75);
		itemsData[4] = new itemsData(2,"Dew",1.2);
		System.out.println(itemsData[0]);*/
//		List<ItemsTableData> itemsData = new ArrayList<ItemsTableData>();
//		itemsData[0] = new ItemsTableData(1,"Chocolate",1.25);
		displayMessage();
		/*itemsData itemData[] = new itemsData[5];
		System.out.println(itemData);*/
		
	}
	
	public static void displayMessage(){
		System.out.println("**************************************************************");
		System.out.println("Welcome to the Simulation of Vending Machine");
		System.out.println("**************************************************************");
		System.out.println("Below Mentioned are the items present in our Vending Machine");
		System.out.println("______________________________________________________________");
		System.out.printf("%1s  %-7s   %-7s%n", "Item Number", "Item Name", "Price($)");
		System.out.println("______________________________________________________________");
		System.out.printf("%1d  %19s   %7.1f%n", 1, "Chocolate", 1.5);
		System.out.printf("%1d  %19s   %7.1f%n", 2, "Chips", 1.5);
		System.out.printf("%1d  %19s   %7.1f%n", 3, "Water", 0.8);
		System.out.printf("%1d  %19s   %7.1f%n", 4, "Coke", 2F);
		System.out.printf("%1d  %19s   %7.1f%n", 5, "Dew", 1.2);
		System.out.println("**************************************************************");
		
//		JSONObject json = new JSONObject()
	}

}
