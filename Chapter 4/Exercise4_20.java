import java.util.Scanner;

class Exercise4_20{
	double getPercentage(double x){
		double cent = x/100;
		x = cent * 9;
	return x;
	}
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		Exercise4_20 ex =  new Exercise4_20();
		
		System.out.println ("Salary Calculator                      ");
		
		System.out.print("Number of hours worked : ");
		double hours = input.nextDouble();
		
		System.out.print("Hourly rate : ");
		double rate = input.nextDouble();
		
		double excess = rate /2;
		double gross = (hours - 40)*excess;
		double pay = hours - 40;
		double salary = 0;
		
		if (hours <= 40){
			salary = hours * rate;
			System.out.println("Salary = "+salary+"\nGross pay = 0.00");
		}
		else{
			salary = hours * rate + gross;
			System.out.println("Salary = "+salary+"\nGross pay = "+ gross);
		}
	}
}