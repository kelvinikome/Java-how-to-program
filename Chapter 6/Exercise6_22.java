import java.util.Scanner;

class Exercise6_22{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Commands\nF\t-\tConvert from celsius to Farenheit\nC\t-\tConvert from Farenheit to Celsius");
		String in = input.next();
		
		if (in.equals("F")){
			System.out.print("Temperature in Celsius : ");
			double tmp = input.nextDouble();
			tmp = 9.0/5.0 * tmp + 32;
			System.out.println("Temperature in Farenheit = "+tmp);
		}
		else if (in.equals("C")){
			System.out.print("Temperature in Farenheit : ");
			double tmp = input.nextDouble();
			tmp = 5.0/9.0 * (tmp + 32);
			System.out.println("Temperature in Celsius = "+tmp);
		}
		else{
			System.out.println("Unrecognized input");
		}
	}
}