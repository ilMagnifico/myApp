package tests;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.App;

public class AppTest {

	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}
	
	@Test
	public void testSayHelloAndThat() {
		assertEquals("Hallo Sir", app.sayHelloAndThat("Sir"));
	}

}
