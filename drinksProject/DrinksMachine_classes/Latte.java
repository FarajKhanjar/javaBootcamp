package bootcamp.oop.drinksProject.DrinksMachine_classes;

import bootcamp.oop.drinksProject.DrinksMachine_classes.Espresso.ShotType;

/**
 * In this class we are interested in realizing a HotLatte drink according to its fields and data. 
 * @author Faraj.
 * This class "Latte" is based on the father class "CoffeeBased".
 * In addition of the hot drink fields, the Latte drink must have:
 * a One shot of Espresso and the rest of the cup is Milk.
 */
public class Latte extends CoffeeBased
{
	// field 
		protected ShotType shotLatteType ;
		protected float milkVolume; //Its a parameter that help us know how much milk there is in the cup.
						
	//constructor
		/**
		 * Construct a HotLatte Drink object from 7 parameters.
		 * @param volume of the HotLatte drink.
		 * @param price of the HotLatte drink.
		 * @param drinkTypeIndex: Hot
		 * @param temperature: A Random value.
		 * @param quantityOfSugar: A random value of the quantity of Sugar.(0 to 5)
		 * @param hotTypeIndex: CoffeeBased.
		 * @param coffeeBasedTypeIndex: HotLatte.
		 */
		public Latte(float volume, float price, int drinkTypeIndex, float temperature, float quantityOfSugar, int hotTypeIndex, int coffeeBasedTypeIndex)
		{
			super(volume, price, drinkTypeIndex, temperature ,quantityOfSugar,hotTypeIndex,coffeeBasedTypeIndex);
			this.shotLatteType = ShotType.values()[0];	//Triple Shot.			
			this.milkVolume = (volume - 50f); //The rest of the drink is hot milk.
		}
		
		@Override
		public String toString() {
			return "You choose to drink a '"+ drinkType +"'-'" + coffeeBasedType + "', with a '"+ shotLatteType + "'-'" + hotDrinkType + "' shot,\n"
					+ "his temperature is:'"+ temperature + " degrees', and the volume is:'" + volume + "cc'.\n"
							+ "With a '"+quantityOfSugar+"' tea-spoons of sugar.\n"
							+ "The price is: '" + price+"' NIS. Thank you and have a nice day :)";
		}
		
			
		public ShotType getShotLateType()
		{
			return this.shotLatteType;
		}
		
		public float getdrinkVolume()
		{			
				return volume;								
		}
		    
		public float getWaterVolume()
		{			
				return (50f);
				
		}	    
		public float getMilkVolume()
		{			
			return milkVolume;			
		}	
}
