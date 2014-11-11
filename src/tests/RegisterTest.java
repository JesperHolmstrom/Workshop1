package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Register;

public class RegisterTest {

	@Test
	public void CreateInstanceOfRegister() {
		Register register = new Register();
		assertEquals(0, register.getSum());
	}

}
