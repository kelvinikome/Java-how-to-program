import java.util.Scanner;

class CaseCast{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sentence : ");
        String sentence1 = input.nextLine();

        System.out.println(sentence1.toUpperCase());
        System.out.println(sentence1.toLowerCase());
    }
}