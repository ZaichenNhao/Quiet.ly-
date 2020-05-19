import java.util.*;

public class Inventory {

	private List<String> inv;

	public void add(String name) {

		if(!inv.contains(name)){
			inv.add(name);
		}
	}

	public void remove(String name) {

		if(inv.contains(name)){
			for(int i=0; i<inv.size();i++){
				if(inv.get(i)==name){
					inv.remove(i);
				}
			}
		}
	}

	public String getList() {
		
		if(inv.size()==0){
			return "there is no items in the list";
		}
		else{
			String connector = ",";
			String re = String.join(connector, inv);
			return re;
		}
	}

	public static void main(String[] args) {
		Inventory myInventory = new Inventory();
		myInventory.add("Shirt");
		myInventory.add("Trousers");
		System.out.println("My current inventory: " + myInventory.getList());
		myInventory.remove("Shirt");
		System.out.println("My current inventory: " + myInventory.getList());
	}
}



// Sample Input For Custom Testing

// add("Shirt")
// add("Trouser") 
// getList
// remove("Shirt")
// getList

// Sample Output

// Shirt,Trouser
// Trouser

// Explanation

// Items 'Shirt' and 'Trouser' are added by the add function. Then, getList is called and the result is printed. Item 'Shirt' is removed by calling the remove function. Finally, getList is called and the result is printed.


