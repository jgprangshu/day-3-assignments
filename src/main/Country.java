package main;

public class Country{
	
	 private String name;
	 private long area;
	 private long population;

	public Country()
	{

	}

	public Country(String name , long area , long population)
	{
		this.name= name;
		this.area= area;
		this.population = population;
	}
	
	public Country findCountryWithLargestArea(Country countries[])
	{
		int index=0;
		int i; 
		long maxArea = countries[0].area;

		for(i=1;i<countries.length;i++)
		{
			if(maxArea < countries[i].area)
			{
				maxArea = countries[i].area;
				index=i;
			}
		}
		return countries[index];



	}

	public Country findCountryWithLargestPopulation(Country countries[])
	{
		int index=0;
		int i; 
		long maxPopulation = countries[0].population;

		for(i=1;i<countries.length;i++)
		{
			if(maxPopulation < countries[i].population)
			{
				maxPopulation = countries[i].population;
				index=i;
			}
		}
		return countries[index];



	}	

	
	public void setCountryName(String name)
	{
		this.name = name;


	}

	public String getCountryName()
	{
		return name;


	}


}



