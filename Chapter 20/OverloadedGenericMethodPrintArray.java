/* Overload generic method printArray of Fig. 20.3 so that it takes two additional integer arguments, lowSubscript and highSubscript . A call
to this method prints only the designated portion of the array. Validate lowSubscript and highSub-
script . If either is out of range, the overloaded printArray method should throw an InvalidSub-
scriptException ; otherwise, printArray should return the number of elements printed. Then
modify main to exercise both versions of printArray on arrays integerArray , doubleArray and
characterArray . Test all capabilities of both versions of printArray .*/

class InvalidSubscriptException extends Exception{
    public InvalidSubscriptException (String message){
        super(message);
    }
}

class OverloadedGenericMethodPrintArray{
    
   public static void main(String[] args) 
   {
      // create arrays of Integer, Double and Character
      Integer[] integerArray = {1, 2, 3, 4, 5, 6};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

      System.out.println("Using printArray method");
      System.out.print("Array integerArray contains:%n");
      printArray(integerArray); // pass an Integer array 
      System.out.printf("%nArray doubleArray contains:%n");
      printArray(doubleArray); // pass a Double array
      System.out.printf("%nArray characterArray contains:%n");
      printArray(characterArray); // pass a Character array

      System.out.println("Using Overloaded printArray method");
      System.out.print("Array integerArray contains:%n");
      try{
        printArray(integerArray, 0, integerArray.length); // pass an Integer array 
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray, 0, doubleArray.length); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray, 0, characterArray.length); // pass a Character array
      }
      catch(InvalidSubscriptException e){
          System.out.println(e);
          System.exit(1);
      }
   } 

   // generic method printArray
   public static <T> void printArray(T[] inputArray)
   {
      // display array elements
      for (T element : inputArray)
         System.out.printf("%s ", element);

      System.out.println();
   }

   public static <T> void printArray(T[] inputArray,T lowSubscript,T highSubscript) throws InvalidSubscriptException{
      // display array elements
      if ((Integer.parseInt(lowSubscript.toString()) > inputArray.length)||
          (Integer.parseInt(highSubscript.toString()) > inputArray.length))
      throw new InvalidSubscriptException("");

      for (int index = 0;index < inputArray.length;index++){
        if ((index >= Integer.parseInt(lowSubscript.toString()))&&
            (index <= Integer.parseInt(highSubscript.toString())))
            System.out.printf("%s ", inputArray[index]);
      }

      System.out.println();
   }
}