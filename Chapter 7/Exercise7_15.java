class Exercise7_15{
    public static void main(String [] args) {
        int [] array = new int[10];
        int count = 0;
        for (String i : args)
            count++;

        if (count > 0){
            int rec = Integer.parseInt(args[0]);
            if (rec > 0){
                array = new int[rec];
            }
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}