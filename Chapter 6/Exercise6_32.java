import java.security.SecureRandom;

class Exercise6_32{
	
	public static int getRand(){
		SecureRandom rand = new SecureRandom();
		int num = rand.nextInt(10)+1;
		int [] odd = {1,3,5,7,9};
		for (int i : odd){
			if (num == i){
				System.out.println(num);
				getRand();
			}
		}
	return num;
	}
	
	public static void main (String [] args){
		Exercise6_32 ex = new Exercise6_32();
		
		int num = getRand();
		
		
		System.out.println("num = "+num);
	}
}