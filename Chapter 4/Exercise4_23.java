import java.util.Scanner;

class Exercise4_23{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		int big = 0,
			tmp = 0,
			small = 0;
		int []	in = new int[10];
		
		for (int i=1;i<11;i++){
			System.out.print ("input the "+i+" number : ");
			tmp = input.nextInt();
			
			for (int x : in){
				if(x == tmp){
					System.out.println("number already exists. Enter another number ");
					i = i-1;
				}
			}
			
			in[i-1] = tmp;
			
			if (in[i-1] > big)
				big = in[i-1];
			if (in[i-1] < small)
				small = in[i-1];
		}
		System.out.println("Largest number = "+big);
		System.out.println("Smallest number = "+small);
	}
}