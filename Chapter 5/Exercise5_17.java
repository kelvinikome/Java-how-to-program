import java.util.Scanner;

class Exercise5_17{
	
	public static void main (String [] args){
		Exercise5_15 ex = new Exercise5_15();
		System.out.println("Product prices                       (type \"-1\" when done with products and prizes)");
		System.out.println("Product 1 : $2.98\nProduct 2 : $4.50\nProduct 3 : $9.98\nProduct 4 : $4.49\nProduct 5 : $6.87\n");
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int []quantity = new int[500];
		double []pnum =  new double[500];
		int count = 0;
		
		while (num != -1){
			System.out.println("\n");
			System.out.print("Product number : ");
			num = input.nextInt();
			
			switch (num){
				case 1 :
					System.out.print("Quantity sold : ");
					pnum[count] = 2.98;
					quantity[count++] = input.nextInt();
					break;
				case 2 :
					System.out.print("Quantity sold : ");
					pnum[count] = 4.50;
					quantity[count++] = input.nextInt();
					break;
				case 3 :
					System.out.print("Quantity sold : ");
					pnum[count] = 9.98;
					quantity[count++] = input.nextInt();
					break;
				case 4 :
					System.out.print("Quantity sold : ");
					pnum[count] = 4.49;
					quantity[count++] = input.nextInt();
					break;
				case 5 :
					System.out.print("Quantity sold : ");
					pnum[count] = 6.87;
					quantity[count++] = input.nextInt();
					break;
				case -1:
					break;
				default:
					System.out.println("Uncrecognized product number ");
					break;
			}
			
		}
		
		System.out.println("Total number of products sold = "+count);
		
		double tPrice = 0;
		
			for (int x=0;x<count;x++){
				tPrice = tPrice + (pnum[x] * quantity[x]);
			}
		
		System.out.println("Total retail value = $"+tPrice);
	}
}