package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.Item;
import src.Register;

public class RegisterTest {

	@Test
	public void CreateInstanceOfRegister() {
		Register register = new Register();
		assertEquals(0, register.getSum());
	}
	
	@Test
	public void shouldAddPriceToSum() {
		Register register = new Register();
		Item milk = new Item("Milk", 30);
		register.addItem(milk);
		assertEquals(30, register.getSum());
	}
	
	@Test
	public void shouldAddItemToRegister() {
		Register register = new Register();
		List<Item> items = new ArrayList<Item>();
		Item milk = new Item("Milk", 30);
		items.add(milk);
		register.addItem(milk);
		assertEquals(items, register.getItems());
	}
	
	@Test
	public void shouldReturnReceipt() {
		Register register = new Register();
		Item milk = new Item("Milk", 30);
		Item eggs = new Item("Eggs", 25);
		Item candy = new Item("Candy", 10);
		register.addItem(milk);
		register.addItem(eggs);
		register.addItem(candy);
		assertEquals("Milk 30, Eggs 25, Candy 10, Number items 3, Sum 65", register.returnReceipt());
	}
	

}
