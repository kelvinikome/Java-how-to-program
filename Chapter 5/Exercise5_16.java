import java.util.Scanner;

class Exercise5_16{
	
	void drawAsterisk(int x){
		int buf = 0;
		while (buf < x){ // print asterisk
			System.out.print ("*");
			buf++;
		}
	}
	
	public static void main (String [] args){
		Exercise5_15 ex = new Exercise5_15();
		Scanner input = new Scanner(System.in);
		
		System.out.print("First number : ");
		int a =  input.nextInt();
		
		System.out.print("Second number : ");
		int b =  input.nextInt();
		
		System.out.print("Third number : ");
		int c =  input.nextInt();
		
		System.out.print("Fourth number : ");
		int d =  input.nextInt();
		
		System.out.print("Fifth number : ");
		int e =  input.nextInt();
		
		
		System.out.print("\n\n");
		ex.drawAsterisk(a);
		System.out.print("\n");
		ex.drawAsterisk(b);
		System.out.print("\n");
		ex.drawAsterisk(c);
		System.out.print("\n");
		ex.drawAsterisk(d);
		System.out.print("\n");
		ex.drawAsterisk(e);
		System.out.print("\n");
	}
}