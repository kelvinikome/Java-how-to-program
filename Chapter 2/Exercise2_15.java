import java.util.Scanner;

class Exercise2_15{
	public static void main (String [] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("First integer : ");
		int x = userInput.nextInt();
		
		System.out.print("Second integer : ");
		int y = userInput.nextInt();
		
		int sum = x + y;
		System.out.println("Sum = " + sum);
		int product = x * y;
		System.out.println("Product = " + product);
		int diff = x - y;
		System.out.println("Difference = " + diff);
		int qot = x / y;
		System.out.println("Quotient = " + qot);
	}
}