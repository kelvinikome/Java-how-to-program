/* Write a program that inputs a sentence from the user (assume
no punctuation), then determines and displays the unique words in alphabetical order. Treat up-
percase and lowercase letters the same. */

import java.util.*;

class DuplicateWordRemoval{
    public static String getUniqueCharacters(String input) {
        String buffer = "";
        int count = 0;
        for (int x = 0; x< input.length();x++){
            char lookCharacter = input.charAt(x);
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == lookCharacter)
                    count++;
            }
            if (count == 1){
                buffer += input.charAt(x)+",";
            }
            count = 0;
        }
        return buffer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a string : ");
        String string = input.nextLine();

        string = getUniqueCharacters(string).toLowerCase();
        
        System.out.println("Displaying unique characters...\n\n\n");
        Arrays.stream(string.split(","))
            .sorted()
            .forEach((character) -> System.out.println(character));
    }
}