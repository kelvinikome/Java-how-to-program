import java.util.Scanner;
import java.io.*;

class HeartRates{
	
	private String firstName;
	private String lastName;
	private int day, month, year;
	
	HeartRates (String fName, String lName, int d, int m, int y){
		firstName = fName;
		lastName = lName;
		day = d;
		month = m;
		year = y;
	}
	
	String getFirstName(){
		return firstName;
	}
	
	void setFirstName (String str){
		firstName = str;
	}
	
	String getLastName (){
		return lastName;
	}
	
	void setLastName (String str){
		lastName = str;
	}
	
	int getDay(){
		return day;
	}
	
	void setDay (int d){
		day = d;
	}
	
	int getMonth(){
		return month;
	}
	
	void setMonth (int m){
		month = m;
	}
	
	int getYear (){
		return year;
	}
	
	void setYear (int y){
		year = y;
	}
	
	int getAge (){
		return 2017 - year;
	}
	
	int getMaxHeartRate (){
		return 220 - getAge();
	}
	
	int getTargetHeartRateA (){
		return ((getMaxHeartRate()/100)*50);
	}
	
	int getTargetHeartRateB (){
		return ((getMaxHeartRate()/100)*85);
	}
}

class Exercise3_16{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("First name : ");
		String fName = input.next();
		
		System.out.print("Last name : ");
		String lName = input.next();
		
		System.out.print("Year of birth : ");
		int year = input.nextInt();
		
		System.out.print("Day: ");
		int day = input.nextInt();
		
		System.out.print("Month : ");
		int month = input.nextInt();
		
		HeartRates heartRate = new HeartRates (fName, lName, day, month, year);
		
		System.out.println ("User name : "+heartRate.getFirstName()+" "+heartRate.getFirstName());
		System.out.println ("Date of birth : "+heartRate.getDay()+"/"+heartRate.getMonth()+"/"+heartRate.getYear());
		System.out.println ("\nAge = "+heartRate.getAge());
		System.out.println ("Target heart rate = "+heartRate.getTargetHeartRateA()+" - "+heartRate.getTargetHeartRateB());
		System.out.println ("Maximum heart rate = "+heartRate.getMaxHeartRate());
		
	}
}