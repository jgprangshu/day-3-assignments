package main;

public class Triangle{
	
	 private int side1;
	 private int side2;
	 private int side3;
 
	public Triangle()
	{

	}

	public Triangle(int side1 , int side2, int side3)
	{
		this.side1= side1;
		this.side2= side2;
		this.side3 = side3;
	}
	
	public boolean checkRightAngledTriangle()
	{
		if(side1>side2 && side1>side3)
		{
			int hypotenuse=side1;
			int base= side2;
			int perpendicular =side3;
				
			if(hypotenuse *hypotenuse == base*base + perpendicular*perpendicular)
			{
			return true;
			}
			else
			{
			return false;
			}

		}
	
		else if(side2>side1 && side2>side3)
		{
			int hypotenuse=side2;
			int base= side1;
			int perpendicular =side3;
					
			if(hypotenuse *hypotenuse == base*base + perpendicular*perpendicular)
			{
			return true;
			}
			else
			{
			return false;
			}
		}
		
		else
		{
			int hypotenuse=side3;
			int base= side1;
			int perpendicular =side2;
			
					
			if(hypotenuse *hypotenuse == base*base + perpendicular*perpendicular)
			{
			return true;
			}
			else
			{
			return false;
			}
		}

	}

		public boolean checkScaleneTriangle()
		{
			if(side1!=side2 && side2!=side3 && side3!=side1)
			{
				return true;
			}
			else
			{
				return false;
			}

		}

		public boolean checkEquilateralTriangle()
		{
			if(side1==side2 && side2==side3 && side3==side1)
			{
				return true;
			}
			else
			{
				return false;
			}


		}

		public boolean checkIsoscelesTriangle()
		{
			if(side1==side2 || side2==side3 || side3==side1)
			{
				return true;
			}
			else
			{
				return false;
			}


		}

	

}



