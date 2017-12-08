class GenericMethodOverload{
    
   public static void main(String[] args) 
   {
      // create arrays of Integer, Double and Character
      Integer[] integerArray = {1, 2, 3, 4, 5, 6};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

      System.out.print("Array integerArray contains:%n");
      printArray(integerArray); // pass an Integer array 
      System.out.printf("%nArray doubleArray contains:%n");
      printArray(doubleArray); // pass a Double array
      System.out.printf("%nArray characterArray contains:%n");
      printArray(characterArray); // pass a Character array

      System.out.println("\n\nArray stringArray contains:");
      String [] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
      printArray(strings);
   } 

   // generic method printArray
   public static <T> void printArray(T[] inputArray)
   {
      // display array elements
      for (T element : inputArray)
         System.out.printf("%s ", element);

      System.out.println();
   }

   public static void printArray(String [] strings){

      int count = 0;
      for (String string : strings){
          if (count++ == 4)
            System.out.println();
        System.out.printf("%5s ", string);
      }
   }
}