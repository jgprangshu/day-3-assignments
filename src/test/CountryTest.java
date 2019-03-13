package test;

import main.Country;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;


public class CountryTest{
		
		Country countries[];

		@Before
		public void setUp()
		{
			countries= new Country[4];
			countries[0]=new Country("India",50000,200700);
			countries[1]=new Country("Australia",60000,300000);
			countries[2]=new Country("UK",5000,500000);
			countries[3]=new Country("Russia",52000,440000);
		}

		@Test
		public void findTheCountryWithLargestArea()
		{
			Country expectedCountryObject = new Country ("Australia",60000,300000);
			Country actualCountryObject = new Country().findCountryWithLargestArea(countries);
			
			assertEquals(expectedCountryObject.getCountryName(),actualCountryObject.getCountryName());


		}

		@Test
		public void findTheCountryWithLargestPopulation()
		{
			Country expectedCountryObject = new Country ("UK",5000,500000);
			Country actualCountryObject = new Country().findCountryWithLargestPopulation(countries);
			
			assertEquals(expectedCountryObject.getCountryName(),actualCountryObject.getCountryName());


		}





}