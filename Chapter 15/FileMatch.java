/* Write a complete file-matching accounts receivable program. Use the account number on
each file as the record key for matching purposes. Assume that each file is a sequential text file with
records stored in increasing account-number order. */

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

class TransactionRecord{
      private int accountNumber;
      private double transactionAmount;

      public TransactionRecord(int accountNumber, double ammount){
            this.accountNumber = accountNumber;
            this.transactionAmount = ammount;
      }

      public int getAccountNumber(){
            return this.accountNumber;
      }

      public void setAccountNumber(int accountNumber){
            this.accountNumber = accountNumber;
      }

      public double getTransactionAmount(){
            return this.transactionAmount;
      }

      public void setTransactionAmount(double amount){
            this.transactionAmount = amount;
      }
}

class FileMatch{
   private static Scanner oldmast;
   private static Scanner trans;

   // open file 
   public static void openFile(){
      try{
         oldmast = new Scanner(Paths.get("oldmast.txt")); 
      } 
      catch (IOException ioException){
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read record from file
   public static void readRecords(){
      System.out.println("Account\tFirst Name\tLast Name\tBalance");
      String accountNumber = "";

      try{
         while (oldmast.hasNext()) // while there is more to read{
            // display record contents                  
            System.out.println(oldmast.next()+"\t"+oldmast.next()+"\t\t"+oldmast.next()+"\t\t"+oldmast.next()+"\t");
         }
       
      catch (NoSuchElementException elementException){
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException){
         System.err.println("Error reading from file. Terminating.");
      } 
   } // end method readRecords

   // close file and terminate application
   public static void closeFile(){
      if (oldmast != null)
         oldmast.close();
   } 
   
   public static void main(String[] args){
      openFile();
      readRecords();
      closeFile();
   } 
}