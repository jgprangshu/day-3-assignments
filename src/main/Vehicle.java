package main;

public class Vehicle{
	int speed;
	int directionDegree;
	String ownerName;

	public Vehicle()
	{

	}
	
	public Vehicle(int speed,int directionDegree,String ownerName)
	{
		this.speed = speed;
		this.directionDegree = directionDegree;
		this.ownerName= ownerName;


	}
	
	public int changeSpeed(int changeSpeed)
	{
		return this.speed + changeSpeed;


	}
	
	







}