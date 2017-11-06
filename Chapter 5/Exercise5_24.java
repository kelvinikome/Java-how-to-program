class Exercise5_24{
	
	void drawAsteriskBlank(int a){
		int pos = 9/2;
		for (int i=0;i<=9;i++){
			if ((i >= pos-(a/2))&&(i <= pos+(a/2)))
				System.out.print ("*");
			else 
				System.out.print (" ");
		}
	}
	
	public static void main (String [] args){
		Exercise5_24 ex = new Exercise5_24();
		
		int y1 = 10;
		int y2 = 10;
		int y3 = 10;
		for (int i=1;i<=7;i+=2){
			ex.drawAsteriskBlank(i);
			System.out.print("\n");
		} 
		for (int i=7;i>=1;i-=2){
			ex.drawAsteriskBlank(i);
			System.out.print("\n");
		} 
		
		
		System.out.print("\n\n");
		
	}
}