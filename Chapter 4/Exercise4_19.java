import java.util.Scanner;

class Exercise4_19{
	double getPercentage(double x){
		double cent = x/100;
		x = cent * 9;
	return x;
	}
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		Exercise4_19 ex =  new Exercise4_19();
		
		System.out.println ("Sales Commision Calculator                      ");
		int in = 0;
		int count = 1;
		double earnings = 0;
		
		System.out.println("Item	Value");
		
		while (count < 5){
			System.out.print (count+"	");
			in = input.nextInt();
			earnings += 200 + ex.getPercentage(in);
			count++;
		}
		
		System.out.println ("Total earnings = "+ earnings);
	}
}