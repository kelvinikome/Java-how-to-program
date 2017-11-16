import java.util.Scanner;

class CompareStrings{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First string : ");
        String string1 = input.nextLine();

        System.out.print("Second string : ");
        String string2 = input.nextLine();

        int value = string1.compareTo(string2);

        if (value == 0)
            System.out.println(string1+" == "+string2);
        else if (value < 0)
            System.out.println(string1+" < "+string2);
        else 
            System.out.println(string1+" > "+string2);
    }
}