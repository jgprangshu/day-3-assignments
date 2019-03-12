package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class GreeterTest{
	
	@Test
	public void testPrintGreeter()
	{	
		Greeter object1 = new Greeter();
		assertEquals(message,object1.printMessage());

	}


}