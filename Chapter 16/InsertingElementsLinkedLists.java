/* (Inserting Elements in a LinkedList in Sorted Order) Write a program that inserts 25 ran-
dom integers from 0 to 100 in order into a LinkedList object. The program should sort the ele-
ments, then calculate the sum of the elements and the floating-point average of the elements. */

import java.security.SecureRandom;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;

class InsertingElementsLinkedLists{
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i<25;i++)
            list.add(rand.nextInt(100));

        Collections.sort(list);

        Integer []numbers = list.toArray(new Integer[0]);

        System.out.println("Number\tSum\tAverage");
        int count =1,
            sum = 0;
        double average = 0;

        for (Integer number : numbers){
            sum += number;
            if (sum != 0)
                average = sum/count++;
            System.out.println(number+"\t"+sum+"\t"+average);
        }
    }
}