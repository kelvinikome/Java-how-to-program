import java.util.Scanner;

class Exercise2_17{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("First integer : ");
		int x = input.nextInt();
		System.out.print("Second integer : ");
		int y = input.nextInt();
		System.out.print("Third integer : ");
		int z = input.nextInt();
		
		
		int sum = x + y + z;
		System.out.println("Sum = " + sum);
		int product = x * y * z;
		System.out.println("Product = " + product);
		int avg = (x + y + z)/3;
		System.out.println("Average = " + avg);
		
		int small = x;
		
		if (small>y)
			small=y;
		
		if (small>z)
			small=z;
		
		int big = x;
		
		if (big<y)
			big=y;
		
		if (big<z)
			big=z;
		
		System.out.println("Smallest = " + small);
		System.out.println("Biggest = " + big);
	}
}