class Exercise4_6{
	public static void main (String [] args){
		int sum = 0;
		int x = 1;
		
		while (x != 11){
			sum = sum + x++;
			System.out.println("The sum is : " + sum);
		}
	}
}