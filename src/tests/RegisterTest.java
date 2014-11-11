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

}
