import java.util.Scanner;

class Exercise2_3 {
	
	int c;
	int thisIsAVariable;
	int q76354;
	int number;
	
	public static void main (String [] args){
		Scanner userInput = new Scanner(System.in);
		
		int value = userInput.nextInt();
		System.out.println("This is a java program");
		System.out.printf("%s%n%s%n", "This is a java ","program");
		
		if (value != 7)
			System.out.println("The variable number is not equal to 7");
	}
}