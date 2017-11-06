class Exercise5_15{
	
	void drawAsteriskBlank(int x){
		int buf = 0;
		while (buf < x){ // print asterisk
			System.out.print ("*");
			buf++;
		}
		while (buf < 20){ // print " "
			System.out.print (" ");
			buf++;
		}
	}
	
	void drawBlankAsterisk(int x){
		int buf = 0;
		while (buf < 20 - x){ // print " "
			System.out.print (" ");
			buf++;
		}
		while (buf < 20){ // print asterisk
			System.out.print ("*");
			buf++;
		}
	}
	
	public static void main (String [] args){
		Exercise5_15 ex = new Exercise5_15();
		
		for (int i=1;i<10;i++){
			ex.drawAsteriskBlank(i);
			System.out.print("\n");
		}
		
		System.out.print("\n\n");
		
		for (int i=10;i>1;i--){
			ex.drawAsteriskBlank(i);
			System.out.print("\n");
		}
		
		System.out.print("\n\n");
		
		for (int i=10;i>0;i--){
			ex.drawBlankAsterisk(i);
			System.out.print("\n");
		}
		
		System.out.print("\n\n");
		
		for (int i=1;i<10;i++){
			ex.drawBlankAsterisk(i);
			System.out.print("\n");
		}
	}
}