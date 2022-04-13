package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a Cold drink according to its fields and data. 
 * @author Faraj
 * This class "ColdDrink" is based on the father class "Drink".
 */
public abstract class ColdDrink extends Drink
{
	// field  
	protected float temperature; ////A random value of the cold temperature between 2->5 degrees
	protected Type coldDrinkType;
	
	//constructor
	/**
	 * Construct a Drink object from 6 parameters.
	 * @param volume of the drink.
	 * @param price of the drink.
	 * @param drinkTypeIndex of the drink (Cold).
	 * @param temperature of the drink.
	 * @param quantityOfSugar: A random value of the quantity of Sugar.
	 * @param coldTypeIndex: A hot drink that based off Coffee or Chocolate.
	 */
	public ColdDrink(float volume, float price, int drinkTypeIndex, float temperature, int coldTypeIndex)
	{
		super(volume, price, drinkTypeIndex);
		setTemperature(temperature);
		this.coldDrinkType = Type.values()[coldTypeIndex];
	}
	
	public enum Type //The constant/enam values
	{
		Soda,
		Soft;	
	}
	
	public float getTemperature() 
	{
        return temperature;
    }

    public void setTemperature(float temperature) 
    {
        if (temperature >= 2 || temperature<=5) 
        {
            this.temperature = temperature;
        } 
        else 
        {
        	temperature = 2.5f;
        }
    }
    
    public float getDrinkVolume()
	{
		return this.volume;
	}
		
	
	public Type getColdDrinkType()
	{
		return this.coldDrinkType;
	}
	
	
	
	public abstract float getWaterVolume();
	
	public abstract float getMilkVolume();
	
	
}
