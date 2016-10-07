package interest;

import java.util.Scanner;

public class SimpleInterest {

	public SimpleInterest() {
		
	}
	
	Scanner scan = new Scanner(System.in);
	
	
	public static void simple() {
		 
		double primary = 0;
		double interest = 0;
		double time = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter details in the following order:");
		System.out.println("Primary interest time");
		
		primary = scan.nextDouble();
		interest = scan.nextDouble();
		time = scan.nextDouble();
		scan.close();
	
		System.out.format("++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.format("%-15s%-15s%-18s%-15s\n", "primary",
				"Interest Rate" , "Interest Amount", "Total");
		System.out.format("%-15.2f%-15.2f%-18.2f%-15.2f\n", primary,interest,
				((primary * interest * time) /100), 
				(((primary * interest * time) /100)+primary));
				
		System.out.format("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 
		 
		 
	}
}
