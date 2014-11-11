package src;

import java.util.ArrayList;
import java.util.List;

public class Register {
	private int sum;
	List<Item> items = new ArrayList<Item>();
	
	public Register() {
		sum = 0;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void addItem(Item i){
		sum += i.getPrice();
		items.add(i);
	}
	
	public List<Item> getItems(){
		return items;
	}

}
