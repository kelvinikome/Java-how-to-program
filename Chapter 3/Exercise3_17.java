import java.util.Scanner;
import java.io.*;

class HealthProfile{
	
	String firstName,
		lastName,
		gender;
	int day, month, year;
	double height, weight;
	
	HealthProfile (String fName, String lName, String gend, int d, int m, int y, double h, double w){
		firstName = fName;
		lastName = lName;
		gender = gend;
		day = d;
		month = m;
		year = y;
		height = h;
		weight = w;
	}
	
	String getGender (){
		return gender;
	}
	
	void setGender (String str){
		gender = str;
	}
	
	double getHeight(){
		return height;
	}
	
	void setHeight (double x){
		height = x;
	}
	
	double getWeight(){
		return weight;
	}
	
	void setWeight (double w){
		weight = w;
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
	
	double getBMI (){
		return (weight/height);
	}
	
}

class Exercise3_17{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("First name : ");
		String fName = input.next();
		
		System.out.print("Last name : ");
		String lName = input.next();
		
		System.out.print("Gender: ");
		String gender = input.next();
		
		System.out.print("Height: ");
		double height = input.nextDouble();
		
		System.out.print("Weight : ");
		double weight = input.nextDouble();
		
		System.out.print("Year of birth : ");
		int year = input.nextInt();
		
		System.out.print("Day: ");
		int day = input.nextInt();
		
		System.out.print("Month : ");
		int month = input.nextInt();
		
		HealthProfile hp = new HealthProfile (fName, lName, gender, day, month, year, height, weight);
		
		System.out.println ("User name : "+hp.getFirstName()+" "+hp.getFirstName());
		System.out.println ("Date of birth : "+hp.getDay()+"/"+hp.getMonth()+"/"+hp.getYear());
		System.out.println ("\nAge = "+hp.getAge());
		System.out.println ("Weight = "+hp.getWeight());
		System.out.println ("Height = "+hp.getHeight());
		System.out.println ("BMI = "+hp.getBMI());
		System.out.println ("Target heart rate = "+hp.getTargetHeartRateA()+" - "+hp.getTargetHeartRateB());
		System.out.println ("Maximum heart rate = "+hp.getMaxHeartRate());
		
	}
}