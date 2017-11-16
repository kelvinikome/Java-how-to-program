import java.util.*;

class ExceptionA extends Exception{
    public ExceptionA(){}
    public ExceptionA(String ex){
        super(ex);
    }
}

class ExceptionB extends ExceptionA{
    public ExceptionB(){}
    public ExceptionB(String msg){
        super(msg);
    }
}

class ExceptionClass{
    public static void main(String[] args) {
        int x = 0,
            y = 0,
            z = 0;
        int count = 0;
        
        Scanner input = new Scanner(System.in);
        
        if (count == 0){
            try{
                throw new ExceptionA();
            }
            catch(ExceptionA e1){
                System.out.println(e1);
            }
            count++;
        }
        if (count == 1){
            try{
                throw new ExceptionB();
            }
            catch(ExceptionB e1){
                System.out.println(e1);
            }
            count++;
        }
        if (count == 2){
            try{
                throw new NullPointerException();
            }
            catch(NullPointerException e1){
                System.out.println(e1);
            }
            count++;
        } /*
        if (count == 3){
            try{
               throw new IOException();
            }
            catch(IOException e1){
                System.out.println(e1);
            }
            count++;
        } */
    }
}