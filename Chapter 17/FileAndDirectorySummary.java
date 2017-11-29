/* Section 15.3 demonstrated how to get infor-
mation about files and directories on disk. In addition, you used a DirectoryStream to display the
contents of a directory. Interface DirectoryStream now contains default method entries , which
returns a Stream . Use the techniques from Section 15.3, DirectoryStream method entries , lamb-
das and streams to summarize the types of files in a specified directory. */

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FileAndDirectorySummary{
   public static void main(String[] args) throws IOException{
      Scanner input = new Scanner(System.in);

      System.out.println("Enter file or directory name:");

      // create Path object based on user input
      Path path = Paths.get(input.nextLine());

      if (Files.exists(path)) {
         // display file (or directory) information
      	System.out.printf("%n%s exists%n", path.getFileName());
      	System.out.printf("%s a directory%n", 
      		Files.isDirectory(path) ? "Is" : "Is not");
      	System.out.printf("%s an absolute path%n", 
      		path.isAbsolute() ? "Is" : "Is not");
      	System.out.printf("Last modified: %s%n", 
      		Files.getLastModifiedTime(path));
      	System.out.printf("Size: %s%n", Files.size(path));
      	System.out.printf("Path: %s%n", path);
      	System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

         if (Files.isDirectory(path)) // output directory listing
         {
            System.out.printf("%nDirectory contents:%n");
            
               // object for iterating through a directory's contents
               DirectoryStream<Path> directoryStream = 
               Files.newDirectoryStream(path);

               Stream<Path> fileStream = StreamSupport.stream(directoryStream.spliterator(), false);
   
            fileStream.forEach((s) -> System.out.println(s));;
         } 
      } 
      else // not file or directory, output error message
      {
         System.out.printf("%s does not exist%n", path);
      }   
   }
}