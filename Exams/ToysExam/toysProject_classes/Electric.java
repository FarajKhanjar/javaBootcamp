package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public abstract class Electric extends AppropriateAge
{

	protected int batteriesNumber;
	protected int soundLevel;
	protected ElectricToyType electricToyType;
	
	public Electric(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex,
			int playIndex, int playingTypeOfToyIndex, int batteriesNumber, int soundLevel) 
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex, playingTypeOfToyIndex);
		this.batteriesNumber=batteriesNumber;
		this.soundLevel=soundLevel;
	}
	
	public enum ElectricToyType //The constant/enam values
	{
		Ride,
		Dinosaur,
		GUITAR;	
	}

}
