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
		register.addItem(milk);
		assertEquals(30, register.getSum());
	}
	
	
}
