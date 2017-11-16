import java.util.Scanner;

class PigLatin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();
        String finalSentence = "";

        String [] tokens = sentence.split(" ");

        for (String token : tokens){
            finalSentence += token.substring(1, token.length()) + token.charAt(0)+"ay ";
        }

        System.out.println(finalSentence);

    }
}