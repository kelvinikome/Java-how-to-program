class Exercise5_22{
	
	void drawAsteriskBlank(int a){
		int bufa = 0;
		while (bufa < a){ // print asterisk
			System.out.print ("*");
			bufa++;
		}
		while (bufa < 20){ // print " "
			System.out.print (" ");
			bufa++;
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
		Exercise5_22 ex = new Exercise5_22();
		
		int y1 = 10;
		int y2 = 10;
		int y3 = 10;
		for (int i=1;i<10;i++){
			ex.drawAsteriskBlank(i);
			ex.drawAsteriskBlank(y1--);
			ex.drawBlankAsterisk(y2--);
			ex.drawBlankAsterisk(i);
			System.out.print("\n");
		}
		
		
		System.out.print("\n\n");
		
	}
}