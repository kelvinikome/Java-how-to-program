import java.util.Scanner;
import java.math.*;

class Exercise6_23{
	public static float minimum3(float x, float y, float z){
		float ret = Math.min(x,y);
		ret = Math.min(ret,z);
		return ret;
	}

	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("First number : ");
		float x = input.nextFloat();
		
		System.out.print("Second number : ");
		float y = input.nextFloat();
		
		System.out.print("Third number : ");
		float z = input.nextFloat();
		
		System.out.println("The minimum of "+x+" "+y+" and "+z+" is "+ minimum3(x,y,z));
	}
}
		