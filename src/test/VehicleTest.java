package test;

import main.Vehicle;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;

public class VehicleTest{

	Vehicle object1;

	@Before
	public void setUp()
	{
		object1 = new Vehicle(50,45,"Jim");

	}
	
	@Test
	public void testCheckhighestIdentificationNumber()
	{
		assertEquals(5679,Vehicle.getHighestIdNumber());
	}
	

	@Test
	public void testCheckSpeed()
	{
		assertEquals(50,object1.changeSpeed(50));

	}

	@Test
	public void testStopVehicle()
	{
		assertEquals(0,object1.stopVehicle());

	}


	@Test
	public void testTurnVehicleDegreeAndDirection()
	{
		assertEquals(40,object1.turnVehicleDegreeAndDirection(5.5,"Left"),0.6);

	}

	
	@Test
	public void testToString()
	{
		assertEquals("50 45.0 Jim 5678",object1.toString());

	}








}


