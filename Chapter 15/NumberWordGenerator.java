import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;

class NumberWordGenerator{

    private static Formatter output; // outputs text to a file   
    
   // close file
   public static void closeFile()
   {
      if (output != null)
         output.close();
   } 

   // open file clients.txt
   public static void openFile()
   {
      try
      {
         output = new Formatter("Wordlist.txt"); // open the file
      }
      catch (SecurityException securityException)
      {
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); // terminate the program
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1); // terminate the program
      } 
   } 
   
   // Write to file
   public static void WriteToFile(String data){
        try{
            // output new record to file; assumes valid input
            output.format("%s", data);                             
        } 
        catch (FormatterClosedException formatterClosedException){
            System.err.println("Error writing to file. Terminating.");
        } 
    }

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner input = new Scanner(System.in);

        String [][] map = new String[25][3]; 
        map[0][0] = "A";
        map[0][1] = "B";
        map[0][2] = "C";

        map[1][0] = "D";
        map[1][1] = "E";
        map[1][2] = "F";

        map[2][0] = "G";
        map[2][1] = "H";
        map[2][2] = "I";

        map[3][0] = "J";
        map[3][1] = "K";
        map[3][2] = "L";

        map[4][0] = "M";
        map[4][1] = "N";
        map[4][2] = "O";

        map[5][0] = "P";
        map[5][1] = "R";
        map[5][2] = "S";

        map[6][0] = "T";
        map[6][1] = "U";
        map[6][2] = "V";

        map[7][0] = "W";
        map[7][1] = "X";
        map[7][2] = "Y";

        map[8][0] = "S";
        map[8][1] = "T";
        map[8][2] = "U";
        
        System.out.print("Enter number : ");
        int number = input.nextInt();
        String word = "";

        while (number != 0){
            int rValue = number % 10;

            for (int x=0;x<3;x++)
                word += map[rValue][x];
            number = number / 10;
        }

        System.out.println(word);

        openFile();
        WriteToFile(word);
        closeFile();
            
    }
}