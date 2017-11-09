class Exercise7_16{
    public static void main(String [] args) {
        int [] array = new int[10];
        int count = 0;
        for (String i : args)
            count++;

        double tmp = 0.00;

        System.out.println(count);
        if (count > 0){
            for (String x : args){
                tmp += Double.parseDouble(x);
            }
        }
        System.out.println("Sum of inputs = "+tmp);
    }
}