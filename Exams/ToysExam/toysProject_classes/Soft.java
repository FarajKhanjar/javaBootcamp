package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;


public abstract class Soft extends Doll
{
	protected SoftToyType softToyType;


	public Soft(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex, int playIndex,
			int playingTypeOfToyIndex ,int dirtyScale, int dollToyTypeIndex, int softToyTypeIndex) {
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex, playingTypeOfToyIndex,dirtyScale,dollToyTypeIndex);
		this.softToyType = SoftToyType.values()[softToyTypeIndex];
	}
	
	public enum SoftToyType //The constant/enam values
	{
		TeddyBear,
		WinnieThePooh,
		JellyCat;	
	}
	
}
