package src;

import java.io.PrintStream;
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
	
	public String getReceipt(){
		StringBuilder sb = new StringBuilder();
		
		for(Item i : items){
			sb.append(i.getProduct() + " " + i.getPrice() + ", ");
		}
		
		sb.append("Nr of items " + items.size());
		sb.append(", Sum " + sum);
		
		return sb.toString();
	}

	public void printReceipt(String receipt, PrintStream printStream) {
		Printer p = new Printer();
		p.print(receipt, printStream);
		
	}

}
