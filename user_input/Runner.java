package bootcamp.basic.user_input;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	/*
	//question 1: Calculating the circumference of a given radius circle
        System.out.println("please enter a radius:");
        float radius = scanner.nextFloat();
        float pi = 3.14f;
        float circ = 2*pi*radius; //circumference of a circle
        System.out.println("the circumference of a circle is: %.2f"+circ); //Circumference with an accuracy of 2 digits
        */
       
		
        //question 2: Calculating the price of ordering toast in the cafeteria
        System.out.println("Hi, the price of the toast is 12 shekels, tick next to each addition how much you would like to order");
        System.out.println("olives:");
        int oli = scanner.nextInt();//olives
        System.out.println("mushrooms:");
        int mush = scanner.nextInt(); //mushrooms
        System.out.println("corn:");
        int corn = scanner.nextInt();
        
        System.out.println("Bulgarian cheese:");
        int bulChe = scanner.nextInt();//Bulgarian cheese
        System.out.println("Extra yellow cheese:");
        int yelChe = scanner.nextInt(); //Extra yellow cheese

        float price = 12 + 2*oli + 2*mush + 2*corn + 3*bulChe + 3*yelChe; //circumference of the final price
        System.out.println("The price of your toast is:"+price+ " NIS");
        
		
	/*
	//question 3: Calculation of the price of the purchase, including transportation and tip
	System.out.println("Hi, To calculate the total price, enter your purchase amount from the store:");
	float basPri = scanner.nextFloat();//basic price
	System.out.println("For transportation, how far is your home from the store?: (in KM)");
        float dis = scanner.nextFloat();//distance
        System.out.println("What floor do you live on? :");
        int flo = scanner.nextInt(); //floor
	System.out.println("What is the weight of the item you purchased?: (in KG)");
        float wei = scanner.nextFloat();//weight
        float tip = basPri*0.10f;
        
        float price = basPri + dis*5 + flo*wei + tip;
        System.out.println("your price is:"+price + " NIS");  //circumference of the final price
        */
		
        scanner.close();
        
	}
}
