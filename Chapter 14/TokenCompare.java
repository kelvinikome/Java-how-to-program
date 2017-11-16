import java.util.Scanner;

class TokenCompare{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        String [] tokens = sentence.split(" ");
        
        System.out.println("\n\n");
        for (String token : tokens)
            if (token.startsWith("b"))
                System.out.println(token);
    }
}