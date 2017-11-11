class Employee{
      protected String firstName;                              
      protected String lastName;                               
      protected String socialSecurityNumber; 
      
      public Employee(String firstName, String lastName, String socialSecurityNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
      }

      String getFirstName(){
            return this.firstName;
      }

      String getLastName(){
            return this.lastName;
      }

      String getSocialSecurityNumber(){
            return this.socialSecurityNumber;
      }


      public String toString(){
         return String.format("%s: %s %n%s: %s", 
            "Employee name : ", this.firstName+" "+ this.lastName, 
            "Social security number : ", this.socialSecurityNumber); 
      } 
}

class CommissionEmployee extends Employee{                
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {
      super(firstName, lastName, socialSecurityNumber);

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            commissionRate+"Commission rate must be > 0.0 and < 1.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor 

   // return first name
   public String getFirstName()
   {
      return firstName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

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
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString()
   {
      return String.format("%s%n%s: %.2f%n%s: %.2f", 
         super.toString(),
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
   } 
} // end class CommissionEmployee

class BasePlusCommissionEmployee{
   private String firstName, lastName, socialSecurityNumber;
   private double grossSales, commissionRate, baseSalary;
   private CommissionEmployee commEmployee;

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales, 
            double commissionRate, double baseSalary)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.grossSales = grossSales;
      this.socialSecurityNumber = socialSecurityNumber;
      this.commissionRate = commissionRate;
      this.baseSalary = baseSalary;   

      commEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, 
            grossSales, commissionRate);                

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // calculate earnings
   public double earnings()
   {
      return getBaseSalary() + commEmployee.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   public String toString()
   {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
      commEmployee.toString(), "base salary", getBaseSalary());   
   } 
} // end class BasePlusCommissionEmployee

class Exercise9_14{
    public static void main(String[] args) {
      CommissionEmployee employee = new CommissionEmployee("john",
      "M", "6766273",63.2323, 0.4);
      
      System.out.println("\tBase Commission Employee Test\n"+employee.toString());


      BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Marry",
      "J", "6766273",70.23, 0.7, 200);
      
      System.out.println("\n\n\tCommission Employee Test\n"+employee1.toString());
    }
}