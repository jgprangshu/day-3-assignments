package test;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import main.Date;

public class DateTest{
	
	Date object1;
	Date object2;
	
	@Before
	public void setUp()
	{
		object1 = new Date(12,12,2012);
		object2 = new Date(04,02,2010);
	}
	
	@Test
	public void testDateInputs()
	{	
		
		assertEquals("12/12/2012",object1.toString());	

	}

	@Test
	public void testCheckTheSmallerString()
	{
		assertTrue(object2.isSmaller(object1));
	}

	@Test
	public void testCheckTheDifferenceOfDate()
	{
		int[] expectedDate = {8,10,2};
		assertArrayEquals(expectedDate,object1.getDifference(object2));
	}
	

}