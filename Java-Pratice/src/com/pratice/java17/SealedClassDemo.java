package com.pratice.java17;

sealed interface Service permits Car , Truck{
	
	int getMaxServiceIntervalInMonth();
	
	default int getMaxDistanceBetweenServicesInKilometers() {
		
		return 10000;
	}
}


abstract sealed class Vehicle permits Car,Truck{
	
	protected final String registerNumber;
	
	Vehicle(String registerNumber){
		this.registerNumber=registerNumber;
	}
	
	String getRegisterNumber() {
		return this.registerNumber;
	}
	
}

final class Car extends Vehicle implements Service{

	final int numberOfSeats;
	
	Car(String registerNumber,int numberOfSeats) {
		super(registerNumber);
		this.numberOfSeats=numberOfSeats;
	}

	@Override
	public int getMaxServiceIntervalInMonth() {
		
		return 12;
	}
	
}

final class Truck extends Vehicle implements Service{

	final int loadCapacity;
	
	Truck(String registerNumber, int loadCapacity) {
		super(registerNumber);
		this.loadCapacity=loadCapacity;
	}

	@Override
	public int getMaxServiceIntervalInMonth() {
		
		return 18;
	}
	
}


public class SealedClassDemo  {

	public static void main (String args[]) {
		
		Car car=new Car("OD342323", 16);
		System.out.println(
				car.getMaxDistanceBetweenServicesInKilometers());
		
		System.out.println(car.getMaxServiceIntervalInMonth());
	
	}
}
