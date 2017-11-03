/* ----------------------------- Algorithm -----------------------------
	1. Get how many gallons it costs to travel for a 1 mile trip 
	2. Get how many trips the driver travelled per day
	3. Calculate the how many gallons used for each trip
	4. Calculate the average gallons used for each trip
	
*/

import java.util.Scanner;

class Exercise4_17{
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("How many trips did you make today? ");
		int trips = input.nextInt();
		int count = 1;
		double cost = 0;
		
		
		while (count <= trips){
			System.out.println("Gallons used on the " + count +" trip");
			cost = cost + input.nextInt();
			count++;
		}
		cost = cost/trips;
		
		System.out.println("Number of miles travelled = "+ trips);
		System.out.println("Average number of Gallons used = "+ cost);
	}
}