import java.util.Scanner;

class Exercise4_21{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		int big = 0,
			small = 0,
			in = 0;
		
		for (int i=1;i<11;i++){
			System.out.print ("input the "+i+" number : ");
			in = input.nextInt();
			
			if (in > big)
				big = in;
			if (in < small)
				small = in;
		}
		System.out.println("Largest number = "+big);
		System.out.println("Smallest number = "+small);
	}
}