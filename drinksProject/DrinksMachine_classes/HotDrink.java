package bootcamp.oop.drinksProject.DrinksMachine_classes;

/**
 * In this class we are interested in realizing a Hot drink according to its fields and data. 
 * @author Faraj
 * This class "HotDrink" is based on the father class "Drink".
 */
public abstract class HotDrink extends Drink 
{
	// field  
		protected float temperature; //A random value of the hot temperature between 30->60 degrees.
		protected float quantityOfSugar;
		protected Type hotDrinkType;
		
	//constructor
		/**
		 * Construct a Drink object from 6 parameters.
		 * @param volume of the drink.
		 * @param price of the drink.
		 * @param drinkTypeIndex of the drink (Hot).
		 * @param temperature of the drink.
		 * @param quantityOfSugar: A random value of the quantity of Sugar.
		 * @param hotTypeIndex: A hot drink that based off Coffee or Chocolate.
		 */
		public HotDrink(float volume, float price, int drinkTypeIndex, float temperature, float quantityOfSugar, int hotTypeIndex)
		{
			super(volume, price, drinkTypeIndex);
			setTemperature(temperature);
			setQuantityOfSugar(quantityOfSugar);
			this.hotDrinkType = Type.values()[hotTypeIndex];
		}
		
		public enum Type //The constant/enam values
		{
			CoffeeBased,
			ChocolateBased;	
		}
		
		public float getTemperature() 
		{
	        return temperature;
	    }

	    public void setTemperature(float temperature) 
	    {
	        if (temperature >= 60 || temperature<=90) 
	        {
	            this.temperature = temperature;
	        } 
	        else 
	        {
	        	temperature = 75;
	        }
	    }
	    
	    public float getQuantityOfSugar() 
		{
	        return quantityOfSugar;
	    }

	    public void setQuantityOfSugar(float quantityOfSugar) 
	    {
	        if (quantityOfSugar >= 0 || quantityOfSugar<=5) 
	        {
	            this.quantityOfSugar = quantityOfSugar;
	        } 
	        else 
	        {
	        	quantityOfSugar = 2.5f;
	        }
	    }
			
		
		public Type getColdDrinkType()
		{
			return this.hotDrinkType;
		}
		
		
		
		public abstract float getWaterVolume();
		
		public abstract float getMilkVolume();

}
