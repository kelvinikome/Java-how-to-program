/* Use the class Invoice provided in the exercises folder
with this chapter’s examples to create an array of Invoice objects. Use the sample data shown in
Fig. 17.20. Class Invoice includes four properties—a PartNumber (type int ), a PartDescription
(type String ), a Quantity of the item being purchased (type int ) and a Price (type double ). Per-
form the following queries on the array of Invoice objects and display the results:
a) Use lambdas and streams to sort the Invoice objects by PartDescription , then display
the results.
b) Use lambdas and streams to sort the Invoice objects by Price , then display the results.
c) Use lambdas and streams to map each Invoice to its PartDescription and Quantity ,
sort the results by Quantity , then display the results.
d) Use lambdas and streams to map each Invoice to its PartDescription and the value of
the Invoice (i.e., Quantity * Price ). Order the results by Invoice value.
e) Modify Part (d) to select the Invoice values in the range $200 to $500. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


interface Payable {    
      double getPaymentAmount(); // calculate payment; no implementation
}
   

class InvoiceClass implements Payable{
   private final String partNumber; 
   private final String partDescription;
   private int quantity;
   private double pricePerItem;

   // constructor
   public InvoiceClass(String partNumber, String partDescription, int quantity,
      double pricePerItem)
   {
      if (quantity < 0) // validate quantity
         throw new IllegalArgumentException("Quantity must be >= 0");

      if (pricePerItem < 0.0) // validate pricePerItem
         throw new IllegalArgumentException(
            "Price per item must be >= 0");

      this.quantity = quantity;
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.pricePerItem = pricePerItem;
   } // end constructor

   // get part number
   public String getPartNumber()
   {
      return partNumber; // should validate
   } 

   // get description
   public String getPartDescription()
   {
      return partDescription;
   } 

   // set quantity
   public void setQuantity(int quantity)
   {
      if (quantity < 0) // validate quantity
         throw new IllegalArgumentException("Quantity must be >= 0");

      this.quantity = quantity;
   } 

   // get quantity
   public int getQuantity()
   {
      return quantity;
   }

   // set price per item
   public void setPricePerItem(double pricePerItem)
   {
      if (pricePerItem < 0.0) // validate pricePerItem
         throw new IllegalArgumentException(
            "Price per item must be >= 0");

      this.pricePerItem = pricePerItem;
   } 

   // get price per item
   public double getPricePerItem()
   {
      return pricePerItem;
   } 

   // return String representation of Invoice object
   @Override
   public String toString()
   {
      return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem());
   } 

   // method required to carry out contract with interface Payable     
   @Override                                                           
   public double getPaymentAmount()                                    
   {                                                                   
      return getQuantity() * getPricePerItem(); // calculate total cost
   } 
} 

class Invoice{
      public static void main(String[] args) {
            ArrayList<InvoiceClass> invoice = new ArrayList<>();
            ArrayList<Integer> partNumber = new ArrayList<>();
            
            invoice.add(new InvoiceClass("83", "Electric Sander", 7, 57.98));
            invoice.add(new InvoiceClass("24", "Power Saw", 18, 99.99));
            invoice.add(new InvoiceClass("7", "Sledge Hammer", 11, 21.50));
            invoice.add(new InvoiceClass("77", "Hammer", 76, 11.99));
            invoice.add(new InvoiceClass("39", "Lawn Mower", 3, 79.50));
            invoice.add(new InvoiceClass("68", "ScrewDriver", 106, 11.00));
            invoice.add(new InvoiceClass("56", "Jig Saw", 21, 7.50));

            System.out.println("Sorting by Part Description...........\n");
            Collections.sort(invoice, ((lhs, rhs) ->  
                  lhs.getPartDescription().compareTo(rhs.getPartDescription()) ));

            invoice.stream()
                  .forEach(i -> System.out.println(i.getPartDescription()));

            System.out.println("\nSorting by Price per Item...........\n");
            Collections.sort(invoice, ((lhs, rhs) ->  
                  lhs.getPricePerItem() > rhs.getPricePerItem() ? -1 : (lhs.getPricePerItem() < rhs.getPricePerItem()) ? 1 : 0));
            
            invoice.stream()
                  .forEach(i -> System.out.println(i.getPricePerItem()));

            System.out.println("\nMapping and Sorting by Quantity...........\n");
            Collections.sort(invoice, ((lhs, rhs) ->  
                  lhs.getQuantity() > rhs.getQuantity() ? -1 : (lhs.getQuantity() < rhs.getQuantity()) ? 1 : 0));
            
            System.out.println("PartNumber\tPartDesciption\tQuantity\tPrice");
            invoice.stream()
                  .forEach(i -> System.out.println(i.getPartNumber()+"\t\t"+
                  i.getPartDescription()+"\t"+i.getQuantity()+"\t\t"+i.getPricePerItem()));

            System.out.println("\nMapping and Sorting by Invoice Value...........\n");
            Collections.sort(invoice, ((lhs, rhs) ->  
                  lhs.getPaymentAmount() > rhs.getPaymentAmount() ? -1 : (lhs.getPaymentAmount() < rhs.getPaymentAmount()) ? 1 : 0));
            
            System.out.println("PartNumber\tPartDesciption\tQuantity\tPrice\tInvoiceValue");
            invoice.stream()
                  .forEach(i -> System.out.println(i.getPartNumber()+"\t\t"+
                  i.getPartDescription()+"\t"+i.getQuantity()+"\t\t"+i.getPricePerItem()
                  +"\t"+i.getPaymentAmount()));

            System.out.println("\nSelecting Invoice values in the range $200 to $500...\n");
            Collections.sort(invoice, ((lhs, rhs) ->  
                  lhs.getPaymentAmount() > rhs.getPaymentAmount() ? -1 : (lhs.getPaymentAmount() < rhs.getPaymentAmount()) ? 1 : 0));
            
            System.out.println("PartNumber\tPartDesciption\tQuantity\tPrice\tInvoiceValue");
            invoice.stream()
                  .forEach(i -> {
                        if ((i.getPaymentAmount() >= 200)&&(i.getPaymentAmount()<=500))
                        System.out.println(i.getPartNumber()+"\t\t"+
                        i.getPartDescription()+"\t"+i.getQuantity()+"\t\t"+i.getPricePerItem()
                        +"\t"+i.getPaymentAmount());});
            
      }
}