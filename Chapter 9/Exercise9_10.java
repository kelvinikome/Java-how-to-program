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

class PieceWorker extends Employee {
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    public String toString(){
        return super.toString();
    }
}
class Exercise9_10{
    public static void main(String[] args) {
        PieceWorker pieceWorker = new PieceWorker("Pauline", "K", "9798789797");

        System.out.println(pieceWorker.toString());
    }
}