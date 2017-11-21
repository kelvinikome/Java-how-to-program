/* Write a program that uses a String method split to to-
kenize a line of text input by the user and places each token in a TreeSet . Print the elements of the
TreeSet */

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class TreeSetSorting{
    public static TreeSet arrayToTreeSet(String[] strings){
        TreeSet set = new TreeSet();
        for (String string : strings)
            set.add(string);
    return set;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet set = new TreeSet<String>();

        System.out.print("Input a string : ");
        String string = input.nextLine();

        String [] stringArray = string.split(" ");

        set = arrayToTreeSet(stringArray);

        System.out.println(set);
    }
}