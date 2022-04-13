package bootcamp.oop.drinksProject.DrinksMachine_classes;

import bootcamp.oop.drinksProject.DrinksMachine_interfaces.Produceable;

/**
 * In this class we are interested in realizing a drink according to its fields and data. 
 * @author Faraj
 * Any drink has a volume, there is a price and there is a temperature,
 * of course there is a type (hot or cold).
 * Take a look at the values in the Main(): arrayOfDrinks() method. 
 */
public abstract class Drink implements Produceable 
{
	// field  
	public float volume; //value between 50->200 cc.
	protected float price; // between 5->15 NIS. (I choose that arbitrary).
	protected Type drinkType; // (hot or cold) drink.
	
	//constructor
	/**
	 * Construct a Drink object from 3 parameters.
	 * @param volume
	 * @param price
	 * @param drinkTypeIndex 
	 */
	public Drink(float volume, float price, int drinkTypeIndex)
	{
		this.volume = volume;
		this.price = price;
		this.drinkType = Type.values()[drinkTypeIndex];
	}
	
	public enum Type //The constant/enam values
	{
		Cold,
		Hot;	
	}
	
	
	@Override
	/**
	 * This method return a string that show us the value of this drink.
	 */
	public String toString() {
		return "Drink [volume=" + volume + ", price=" + price + ", drinkType=" + drinkType + "]";
	}

	/**
	 * This method 
	 * @return volume of the drink.
	 */
	public float getDrinkVolume()
	{
		return this.volume;
	}

    /**
     * This Method check the correctness of the random value,
     * @param the volume of the drink.
     */
	public void setVolume(float volume) 
    {
        if (volume >= 50 && volume<=200) 
        {
            this.volume = volume;
        } 
        else 
        {
        	volume = 125;
        }
    }
	
	/**
	 * This method
	 * @return The tyoe of this drink (Hot or Cold)
	 */
	public Type getDrinkType()
	{
		return this.drinkType;
	}
	
	//public produce()

	public abstract float getWaterVolume();
	
	public abstract float getMilkVolume();
}
