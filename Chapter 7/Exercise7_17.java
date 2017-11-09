import java.security.SecureRandom;

class Exercise7_17{
    public static void main(String [] args) {
        SecureRandom rand = new SecureRandom();

        int die1 = 1+rand.nextInt(6);
        int die2 = 1+rand.nextInt(6);
        int sum = 0;
        int []tally = new int [12];

        for (int i=0;i<=3600;i++){
            sum = die1 + die2;
            tally[sum]++;
        }

        for (int i=1;i<=11;i++)
            System.out.println("tally "+i+" = "+tally[i]);
        
    }
}