package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public abstract class BrokenToy extends Toy
{
		
	public BrokenToy(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex) 
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return ("Sorry! its a BrokenToy because its a more than a year old: "+ageOfToy);
	}


}
