package bootcamp.oop.exam.toysProject_classes;

import java.time.LocalDate;

public abstract class Hard extends Doll
{	
	protected HardToyType hardToyType;

	public Hard(long serialNumber, String name, LocalDate purchaseDate, float ageOfToy, int toyTypeIndex, int playIndex,
			int playingTypeOfToyIndex ,int dirtyScale, int dollToyTypeIndex, int hardToyTypeIndex)
	{
		super(serialNumber, name, purchaseDate, ageOfToy, toyTypeIndex, playIndex, playingTypeOfToyIndex,dirtyScale,dollToyTypeIndex);
		this.hardToyType = HardToyType.values()[hardToyTypeIndex];
	}
	
	public enum HardToyType //The constant/enam values
	{
		Barbie,
		LitePuzzle,
		MusicalToy;	
	}

}
