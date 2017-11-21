import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

class Sample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner fileIn = new Scanner(Paths.get("client.txt"));

        System.out.print("input file name : ");
        String fileName = input.nextLine();


    }
}