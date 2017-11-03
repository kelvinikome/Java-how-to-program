import java.util.Scanner;

class Exercise2_5{
	public static void main (String [] args){
		Scanner userInput = new Scanner(System.in);
		
		int x, y, z, result;
		
		System.out.print ("First integer : ");
		x = userInput.nextInt();
		
		System.out.print ("Second integer : ");
		y = userInput.nextInt();
		
		
		System.out.print ("Third integer : ");
		z = userInput.nextInt();
		
		result = x * y * z;
		
		System.out.printf("%s%d%n", "The product is ", result);
	}
}