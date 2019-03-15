package main;

public class Vehicle{
	private int speed;
	private double directionDegree;
	private String ownerName;
	private long vehicleIdNumber;
	private static long highestIdentificationNumber =5678;
	public static final String TURN_LEFT="Left";
	public static final String TURN_RIGHT="Right";
	
	

	public Vehicle()
	{
		vehicleIdNumber = highestIdentificationNumber++;
	}
	
	public Vehicle(int speed,int directionDegree,String ownerName)
	{	this();
		this.speed = speed;
		this.directionDegree = directionDegree;
		this.ownerName= ownerName;


	}

	public static long getHighestIdNumber()
	{
		return highestIdentificationNumber ;
	}
	
	public int changeSpeed(int speed)
	{
		return speed;


	}

	public int stopVehicle()
	{
		return 0;


	}


	public double turnVehicleDegreeAndDirection(double directionDegree,String leftRightDirection)
	{
		if(leftRightDirection==TURN_LEFT)
		{
			double afterRotation = this.directionDegree-directionDegree;
			return afterRotation;
		}
		else if(leftRightDirection==TURN_RIGHT)
		{
			double afterRotation = this.directionDegree+directionDegree;
			return afterRotation;

		}
		else
		{
			return 0.0;
		}

	}

	
	
	//setter and getter method for speed
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public double getSpeed()
	{
		return speed;
	}

	//setter and getter method for directionDegree
	public void setDirectionDegree(int directionDegree)
	{
		this.directionDegree = directionDegree;
	}

	public double getDirectionDegree()
	{
		return directionDegree;
	}

	//setter and getter method for ownerName
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}

	public String getOwnerName()
	{
		return ownerName;
	}

	public String toString()
	{
		return this.speed +" " +this.directionDegree +" " +this.ownerName +" " +this.vehicleIdNumber ;
	}
	







}