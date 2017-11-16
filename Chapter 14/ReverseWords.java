import java.util.Scanner;
import java.util.StringTokenizer;

class ReverseWords{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        String [] tokens = sentence.split(" ");

        for (String token : tokens){
            for (int tokenLenght = (token.length()-1);tokenLenght >= 0;tokenLenght--)
                System.out.print(token.charAt(tokenLenght));
            System.out.print(" ");
        }
    }
}