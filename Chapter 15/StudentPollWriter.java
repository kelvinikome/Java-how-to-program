
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;

class StudentPollWriter{

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
         output = new Formatter("numbers.txt"); // open the file
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
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Student Poll Survery Data");
        System.out.println("Rating\tFrequency");
        String number = "";

        for (int loop=1;loop<6;loop++){
            System.out.print(loop+"\t");
            number += input.nextInt() + "\n";
        }

        openFile();
        System.out.println("writing data to file...(Numbers.txt)");
        WriteToFile(number);
        System.out.println("done");
        closeFile();
            
    }
}