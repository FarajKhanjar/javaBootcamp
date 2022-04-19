package bootcamp.oop.exam.toysProject;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import bootcamp.oop.drinksProject.DrinksMachine_interfaces.Produceable;
import bootcamp.oop.exam.toysProject_classes.BrokenToy;
import bootcamp.oop.exam.toysProject_classes.Hard;
import bootcamp.oop.exam.toysProject_classes.Kid;
import bootcamp.oop.exam.toysProject_classes.Soft;
import bootcamp.oop.exam.toysProject_classes.Toy;
import bootcamp.oop.exam.toysProject_interface.Playable;

public class Runner 
{
	public static Scanner scanner = new Scanner(System.in);
	
	public static Toy[] arrayOfToys()
	{
		LocalDate kidBirthDate ; 
		Kid kid1 = new kid1("Rami" , kidBirthDate);
		Toy[] toysArray = new Toy[4];
		long serialNumber;
		String name;
		LocalDate purchaseDate;
		float ageOfToy = (int)(Math.random()*3); // a year age between 0 -> 3
		int toyTypeIndex;
		int index=0;

		Random rand = new Random();
		int randIndex;
		
		if(ageOfToy >= 1)
		{
			name = "TeddyBear";
			serialNumber = (int)(Math.random()*1000);
			Toy toy1 = new BrokenToy(serialNumber, name, purchaseDate, ageOfToy, 0);
			toysArray[index] = toy1;		
		}
		else
		{
			index++;
			name = "TeddyBear";
			long serialNumber1 = (int)(Math.random()*1000);
			Toy toy1 = new Soft(serialNumber, name, purchaseDate, ageOfToy, 1 , 0 , 0 , 5 , 1 , 0);
			toysArray[index] = toy1;
			
			index++;
			name = "WinnieThePooh";
			long serialNumber2 = (int)(Math.random()*1000);
			Toy toy2 = new Soft(serialNumber, name, purchaseDate, ageOfToy, 1 , 0 , 0 , 5 , 1 , 1);
			toysArray[index] = toy2;
			
			index++;
			name = "LitePuzzle";
			long serialNumber3 = (int)(Math.random()*1000);
			Toy toy3 = new Hard(serialNumber3, name, purchaseDate, ageOfToy, 1 , 0 , 0 , 2 , 1 , 1);
			toysArray[index] = toy3;
			
			index++;
			name = "Barbie";
			long serialNumber4 = (int)(Math.random()*1000);
			Toy toy4 = new Hard(serialNumber4, name, purchaseDate, ageOfToy, 1 , 0 , 0 , 6 , 1 , 0);
			toysArray[index] = toy4;
			
			index++;
			name = "LitePuzzle";
			long serialNumber3 = (int)(Math.random()*1000);
			Toy toy5 = new Electric(serialNumber3, name, purchaseDate, ageOfToy, 1 , 0 , 0 , 2 , 1 , 1);
			toysArray[index] = toy5;
			
			index++;
			name = "Barbie";
			long serialNumber4 = (int)(Math.random()*1000);
			Toy toy6 = new Electric(serialNumber4, name, purchaseDate, ageOfToy, 1 , 0 , 1 , 5 , 3 , 4);
			toysArray[index] = toy6;
			
		}
		
		return toysArray;
		
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to our Toys Place :) \n");
		
		int totalDirtiness=0;
		Toy[] toysArray = arrayOfToys();
		
		// Playable toy = createtoy();    
		// toy.print();
		    
		for (Toy toy : toysArray) {
			System.out.println(toy.toString());
		}
				
		scanner.close();

	}

}
