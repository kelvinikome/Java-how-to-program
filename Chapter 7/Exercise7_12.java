import java.util.Scanner;

class Exercise7_12{

    public static Scanner input = new Scanner(System.in);
    public static int [] inarr = new int [5];
    public static int count = 0;
    public static int inx;

    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            System.out.print("\nEnter a number : ");
            inx = input.nextInt();
            if (!((inx >=10)&&(inx <=100))){
                System.out.println("Input out of range");
                main(args);
            }
            else{
                int found = 0;
                for (int y : inarr){
                    if (inx == y){
                        found = 1;
                    }
                }
                if (found == 1){
                    System.out.println("Input already exists");
                    main(args);
                }
                else{
                    inarr[count++] = inx;
                    System.out.print("previously inputted values = ");
                    for (int y : inarr){
                       System.out.print(y+",");
                    }
                }
            }
        }
    }
}