class Exercise4_6{
	public static void main (String [] args){
		int sum = 0;
		int x = 1;
		
		while (x != 11){
			sum = x + x++;
			int y = x-1;
			System.out.println("The sum of "+y+" and "+y+" is : " + sum);
		}
	}
}