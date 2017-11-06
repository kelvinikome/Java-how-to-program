import java.security.SecureRandom;
class Sample{
	public static void main (String [] args){
		SecureRandom rand = new SecureRandom();
		
		System.out.println(rand.nextInt(3));
	}
}