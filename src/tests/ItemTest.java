package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import src.Item;

public class ItemTest {

	
	@Test
	public void shouldReturnCorrectItem() {
		Item i = new Item("Milk", 30);
		assertEquals("Milk", i.getProduct());
		assertEquals(30, i.getPrice());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentOnPrice() {
		Item i = new Item("Eggs", -3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentOnString() {
		Item i = new Item("", 30);
	}
	

}
