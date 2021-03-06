package src;

public class Item {
	private String product;
	private int price;
	
	public Item(String product, int price) {
		if(price < 0 || product.equals("")){
			throw new IllegalArgumentException();
		}
		
		this.product = product;
		this.price = price;
	}
	
	public String getProduct(){
		return product;
	}
	
	public int getPrice(){
		return price;
	}

}
