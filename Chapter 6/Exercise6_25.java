class Exercise6_25{
	public static int isPrime(int x){
		int y = x;
		int sum = 0;
		int count = 0;
		while (y > 0){
			if ((x%y)==0){
				count++;
			}
			y--;
		}
		if (count == 2)
			return 1;
		
	return 0;
	}
	public static void main (String [] args){
		for (int i=1;i<10000;i++)
			if (isPrime(i) == 1)
				System.out.println(i+" is a prime number");
	}
}