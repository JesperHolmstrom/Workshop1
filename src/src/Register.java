package src;

public class Register {
	private int sum;
	
	public Register() {
		sum = 0;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void addItem(Item i){
		sum += i.getPrice();
	}
	

}
