import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

class StudentPollReader{
    private static Scanner input;
    
       // open file 
       public static void openFile(){
          try{
             input = new Scanner(Paths.get("numbers.txt")); 
          } 
          catch (IOException ioException){
             System.err.println("Error opening file. Terminating.");
             System.exit(1);
          } 
       }

   // close file and terminate application
    public static void closeFile(){
        if (input != null)
        input.close();
    } 
    

   // read record from file
   public static void readData(){
        int count = 1;
        try{
        while (input.hasNext()) // while there is more to read{
            // display record contents                   
            System.out.print(count+++"\t"+input.nextInt()+"\n");

        }
        
        catch (NoSuchElementException elementException){
        System.err.println("File improperly formed. Terminating.");
        } 
        catch (IllegalStateException stateException){
        System.err.println("Error reading from file. Terminating.");
        } 
    }

    public static void main(String[] args) {

        System.out.printf("%s%10s%n", "Rating", "Frequency");
        openFile();
        readData();
        closeFile();
    }
}