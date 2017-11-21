/* Write a program that reads in a series of first names and eliminates
duplicates by storing them in a Set . Allow the user to search for a first name. */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

class DuplicateElimination{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> firstName = new ArrayList<String>();
        ArrayList<String> lastName = new ArrayList<String>();

        System.out.println("Enter (-1) to end\nFirst name\t");
        firstName.add(input.next());

        while (!firstName.get(firstName.size()-1).equals("-1")){
            firstName.add(input.next());
        }

        Set<String> set = new HashSet<>(firstName);

        System.out.println("\n\n\nEliminating duplicates...");
        for (String setName : set){
            System.out.println(setName);
        }
    }
}