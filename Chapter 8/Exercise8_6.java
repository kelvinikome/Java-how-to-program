class SavingsAccount{
    static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double x, double y){
        annualInterestRate = x;
        savingsBalance = y;
    }

    double calculateMonthlyInterest(){
        return (savingsBalance * annualInterestRate)/12;
    }

    void modifyInterestRate(double x){
        annualInterestRate = x;
    }
}
class Exercise8_6{
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(4,2000.00);
        SavingsAccount saver2 = new SavingsAccount(4,3000.00);

        System.out.println("Interest rate = 4%");
        System.out.println("saver 1 balance = "+saver1.calculateMonthlyInterest());
        System.out.println("saver 2 balance = "+saver2.calculateMonthlyInterest());


        System.out.println("Interest rate = 5%");
        saver1.modifyInterestRate(5);
        saver2.modifyInterestRate(5);
        System.out.println("saver 1 balance = "+saver1.calculateMonthlyInterest());
        System.out.println("saver 2 balance = "+saver2.calculateMonthlyInterest());

    }
}