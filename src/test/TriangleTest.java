package test;

import main.Triangle;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;

public class TriangleTest{

		Triangle object1;
		@Before
		public void setUp()
		{
			object1=new Triangle(3,4,5);
			
		}

		@Test
		public void findRightAngledTriangle()
		{
			
			assertTrue(object1.checkRightAngledTriangle());


		}

		@Test
		public void findScaleneTriangle()
		{
			
			assertTrue(object1.checkScaleneTriangle());


		}

		@Test
		public void findEquilateralTriangle()
		{
			assertTrue(object1.checkEquilateralTriangle());


		}

		@Test
		public void findIsoscelesTriangle()
		{
			assertTrue(object1.checkIsoscelesTriangle());


		}




		




}