class Exercise6_24{
	public static int isPerfect (int x){
		int y = x;
		int sum = 0;
		int count = 0;
		while (y > 0){
			if ((x%y)==0){
				if (count == 0){
					count++;
				}
				else{
					sum += y;
				}
			}
			y--;
		}
			
		if (sum == x)
			return 1;
	return 0;
	}
	public static void listFactors (int x){
		int y = x;
		int sum = 0;
		int count = 0;
		while (y > 0){
			if ((x%y)==0){
				if (count == 0){
					count++;
				}
				else{
					System.out.print(y+",");
				}
			}
			y--;
		}
	}
	
	public static void main (String [] aergs){
		for (int i=1;i<=1000;i++)
			if (isPerfect(i) == 1){
				System.out.print(i+" is a perfect number. Factors = ");
				System.out.print("(");listFactors(i);System.out.println(")");
			}
	}
}