import java.security.SecureRandom;
import java.util.*;

class SortingAndRemovingDuplicates{
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        
        Character [] map = new Character[26]; 
        map[0] = 'A';
        map[1] = 'B';
        map[2] = 'C';
        map[3] = 'D';
        map[4] = 'E';
        map[5] = 'F';
        map[6] = 'G';
        map[7] = 'H';
        map[8] = 'I';
        map[9] = 'J';
        map[10] = 'K';
        map[11] = 'L';
        map[12] = 'M';
        map[13] = 'N';
        map[14] = 'O';
        map[15] = 'P';
        map[16] = 'R';
        map[17] = 'S';
        map[18] = 'T';
        map[19] = 'U';
        map[20] = 'V';
        map[21] = 'W';
        map[22] = 'X';
        map[23] = 'Y';
        map[24] = 'S';
        map[25] = 'Z';

        List<Character> list = new ArrayList<>();

        for (int i=0;i<=30;i++)
            list.add(map[rand.nextInt(25)]);

        System.out.println("Sorting...");
        list.stream()
            .sorted()
            .forEach((s) -> System.out.println(s));

        System.out.println("\n\nReversing...");
        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach((s) -> System.out.println(s));

        System.out.println("removing duplicates and displaying in ascending order...");
        String string = getUniqueCharacters(list.toString());

        System.out.println(string);
        Arrays.stream(string.split(","))
            .sorted()
            .forEach(s -> System.out.println(s));
    }


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
}