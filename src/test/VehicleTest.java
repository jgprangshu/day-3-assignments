package test;

import main.Vehicle;
import org.junit.*;
import static org.junit.Assert.*;

public class VehicleTest{

	Vehicle object1;

	@Test
	public void createVehicle()
	{
		object1 = new Vehicle(50,45,"Jim");

	}

	@Test
	public void testCheckSpeed()
	{
		assertEquals(100,object1.changeSpeed(50));

	}
	









}


