class HeartRates{
	
	String firstName;
	String lastName;
	int day, month, year;
	
	HeartRates (String fName, String lName, double sal){
		firstName = fName;
		lastName = lName;
		salary = sal;
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
	
	double getSalary(){
		return salary;
	}
	
	void setSalary (double sal){
		salary = sal;
	}
}

class Exercise3_13{
	public static void main (String [] args){
		Employee employee1 = new Employee("John", "M", 500);
		Employee employee2 = new Employee("Marry", "J", 300);
		
		System.out.println("Employee\tMonthly Salary\tAnnual Salary");
		System.out.println("1\t\t"+employee1.getSalary()+"\t\t"+employee1.getSalary()*12);
		System.out.println("2\t\t"+employee2.getSalary()+"\t\t"+employee2.getSalary()*12);
		
		System.out.println("Raising Salary by 10%...");
		employee1.setSalary(((employee1.getSalary()/100)*10) + employee1.getSalary());
		employee2.setSalary(((employee2.getSalary()/100)*10) + employee2.getSalary());
		System.out.println("1\t\t"+employee1.getSalary()+"\t\t"+employee1.getSalary()*12);
		System.out.println("2\t\t"+employee2.getSalary()+"\t\t"+employee2.getSalary()*12);
	}
}