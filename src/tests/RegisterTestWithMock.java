package tests;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import src.Item;
import src.Register;
//Using mock when creating items or printer
public class RegisterTestWithMock {

	@Test
	public void CreateInstanceOfRegister() {
		Register register = new Register();
		assertEquals(0, register.getSum());
	}
	
	@Test
	public void shouldAddPriceToSum() {
		Register register = new Register();
		Item milk = Mockito.mock(Item.class);
		Mockito.when(milk.getPrice()).thenReturn(30);
		register.addItem(milk);
		Mockito.verify(milk).getPrice();
		assertEquals(30, register.getSum());
	}
	
	@Test
	public void shouldAddItemToRegister() {
		Register register = new Register();
		List<Item> items = new ArrayList<Item>();
		Item milk = Mockito.mock(Item.class);
		items.add(milk);
		register.addItem(milk);
		assertEquals(items, register.getItems());
	}
	
	@Test
	public void shouldReturnReceipt() {
		Register register = new Register();
		Item milk = Mockito.mock(Item.class);
		Mockito.when(milk.getPrice()).thenReturn(30);
		Mockito.when(milk.getProduct()).thenReturn("Milk");
		

		Item eggs = Mockito.mock(Item.class);
		Mockito.when(eggs.getPrice()).thenReturn(25);
		Mockito.when(eggs.getProduct()).thenReturn("Eggs");
		

		Item candy = Mockito.mock(Item.class);
		Mockito.when(candy.getPrice()).thenReturn(10);
		Mockito.when(candy.getProduct()).thenReturn("Candy");
		
		register.addItem(milk);
		register.addItem(eggs);
		register.addItem(candy);
		
		assertEquals("Milk 30, Eggs 25, Candy 10, Nr of items 3, Sum 65", register.getReceipt());
	}
	
}
