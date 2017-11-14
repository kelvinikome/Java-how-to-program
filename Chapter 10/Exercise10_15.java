class Date 
{
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year)
   {
      // check if month in range
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");

      // check if day in range for month
      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day + 
            ") out-of-range for the specified month and year");

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0)))
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

      this.month = month;
      this.day = day;
      this.year = year;

      System.out.printf(
         "Date object constructor for date %s%n", this);
   } 
   
   // return a String of the form month/day/year
   public String toString()
   { 
      return String.format("%d/%d/%d", month, day, year); 
   } 
}

abstract class Employee implements Payable{
   private String firstName;
   private String lastName;
   private Date birthDate;
   private Date hireDate;
   private String socialSecurityNumber;

   // constructor to initialize name, birth date and hire date
   public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, 
      Date hireDate)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthDate = birthDate;
      this.hireDate = hireDate;
      this.socialSecurityNumber = socialSecurityNumber;
   } 

   // convert Employee to String format
   public String toString()
   {
      return String.format("%s, %s  Hired: %s  Birthday: %s", 
         lastName, firstName, hireDate, birthDate);
   } 

   abstract double earnings();
}

class HourlyEmployee extends Employee 
{
   private double wage; // wage per hour
   private double hours; // hours worked for week

   // constructor
   public HourlyEmployee(String firstName, String lastName,
      String socialSecurityNumber, double wage, double hours, Date birth, Date hire)
   {
      super(firstName, lastName, socialSecurityNumber, birth, hire);

      if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

      if ((hours < 0.0) || (hours > 168.0)) // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");

      this.wage = wage;
      this.hours = hours;
   } 

   // set wage
   public void setWage(double wage)
   {
      if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

      this.wage = wage;
   } 

   public double getWage()
   {
      return wage;
   } 

   // set hours worked
   public void setHours(double hours)
   {
      if ((hours < 0.0) || (hours > 168.0)) // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");

      this.hours = hours;
   } 

   // return hours worked
   public double getHours()
   {
      return hours;
   } 
                                            
   public double earnings()                                            
   {                                                                   
      if (getHours() <= 40) // no overtime                           
         return getWage() * getHours();                                
      else                                                             
         return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
   }  
   
   public double getPaymentAmount(){
         return earnings();
   }

   // return String representation of HourlyEmployee object              
   @Override                                                             
   public String toString()                                              
   {                                                                     
      return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", getWage(),                     
         "hours worked", getHours());                                   
   }                                    
} 

class SalariedEmployee extends Employee {
   private double weeklySalary;

   // constructor
   public SalariedEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double weeklySalary, Date birthDate, Date hireDate)
   {
      super(firstName, lastName, socialSecurityNumber, birthDate, hireDate); 

      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   } 

   // set salary
   public void setWeeklySalary(double weeklySalary)
   {
      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   } 

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   // calculate earnings; override abstract method earnings in Employee
   public double earnings()                                            
   {                                                                   
      return getWeeklySalary();                                        
   }                                             
  
   public double getPaymentAmount(){
      return earnings();
}
   // return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   } 
} 

class CommissionEmployee extends Employee {
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // constructor
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, Date birth, Date hire)
   {
      super(firstName, lastName, socialSecurityNumber, birth, hire);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate 
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // calculate earnings; override abstract method earnings in Employee
                                
   public double earnings()                                            
   {                                                                   
      return getCommissionRate() * getGrossSales();                    
   }     
   
   public double getPaymentAmount(){
         return earnings();
   }

   // return String representation of CommissionEmployee object
   @Override                                                   
   public String toString()                                    
   {                                                           
      return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",    
         "commission employee", super.toString(),              
         "gross sales", getGrossSales(),                       
         "commission rate", getCommissionRate());             
   } 
}

class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary; // base salary per week

   // constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales,
      double commissionRate, double baseSalary, Date birth, Date hire)
   {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate, birth, hire);

      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate earnings; override method earnings in CommissionEmployee
   @Override                                                            
   public double earnings()                                             
   {                                                                    
      return getBaseSalary() + super.earnings();                        
   } 

   // return String representation of BasePlusCommissionEmployee object
   @Override                                                           
   public String toString()                                            
   {                                                                   
      return String.format("%s %s; %s: $%,.2f",                       
         "base-salaried", super.toString(),                            
         "base salary", getBaseSalary());                             
   } 
} 

interface Payable {    
   double getPaymentAmount(); // calculate payment; no implementation
}

class Invoice implements Payable{
   private final String partNumber; 
   private final String partDescription;
   private int quantity;
   private double pricePerItem;

   // constructor
   public Invoice(String partNumber, String partDescription, int quantity,
      double pricePerItem)
   {
      if (quantity < 0) // validate quantity
         throw new IllegalArgumentException("Quantity must be >= 0");

      if (pricePerItem < 0.0) // validate pricePerItem
         throw new IllegalArgumentException(
            "Price per item must be >= 0");

      this.quantity = quantity;
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.pricePerItem = pricePerItem;
   } // end constructor

   // get part number
   public String getPartNumber()
   {
      return partNumber; // should validate
   } 

   // get description
   public String getPartDescription()
   {
      return partDescription;
   } 

   // set quantity
   public void setQuantity(int quantity)
   {
      if (quantity < 0) // validate quantity
         throw new IllegalArgumentException("Quantity must be >= 0");

      this.quantity = quantity;
   } 

   // get quantity
   public int getQuantity()
   {
      return quantity;
   }

   // set price per item
   public void setPricePerItem(double pricePerItem)
   {
      if (pricePerItem < 0.0) // validate pricePerItem
         throw new IllegalArgumentException(
            "Price per item must be >= 0");

      this.pricePerItem = pricePerItem;
   } 

   // get price per item
   public double getPricePerItem()
   {
      return pricePerItem;
   } 

   // return String representation of Invoice object
   @Override
   public String toString()
   {
      return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem());
   } 

   // method required to carry out contract with interface Payable     
   @Override                                                           
   public double getPaymentAmount()                                    
   {                                                                   
      return getQuantity() * getPricePerItem(); // calculate total cost
   } 
} 

class Exercise10_15 {
   public static void main(String[] args) {
         
      Date birth = new Date(7, 24, 1949);
      Date hire = new Date(3, 12, 2016);

      Payable[] payableObjects = new Payable[6];
      
      payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
      payableObjects[2] = 
         new SalariedEmployee("John", "Smith", "111-11-1111", 200.0, birth, hire);
      payableObjects[3] = 
         new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00, birth, hire);
      payableObjects[4] = 
         new HourlyEmployee("Karen", "Price", "222-22-2222", 200.0, 40.0, birth, hire);
      payableObjects[5] = 
         new CommissionEmployee(
            "Sue", "Jones", "333-33-3333", 10000, .06, birth, hire);

      System.out.println(
         "Invoices and Employees processed polymorphically:"); 

      for (Payable currentPayable : payableObjects){
         // output currentPayable and payment amount
         System.out.printf("%n%s %n%s: $%,.2f%n", 
            currentPayable.toString(), 
            "payment due", currentPayable.getPaymentAmount()); 
      } 
   } 
} 