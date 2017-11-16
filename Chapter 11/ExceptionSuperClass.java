class ExceptionA{
    protected int x, y;
    
    public ExceptionA(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int div(){
        int result = 0;
        try{
            result = this.x/this.y;
        }
        catch (ArithmeticException arithmeticException){
            System.err.printf("%nException: %s%n", arithmeticException);
            System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
        }
    return result;
    }

    public int multiply(){
        int result = 0;
        try{
            result = this.x*this.y;
        }
        catch (ArithmeticException arithmeticException){
            System.err.printf("%nException: %s%n", arithmeticException);
            System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
        }
    return result;
    }
}

class ExceptionB extends ExceptionA{
    public ExceptionB(int x, int y){
        super(x,y);
    }

    public int divide(){
        return super.div();
    }
}

class ExceptionC extends ExceptionB{
    public ExceptionC(int x, int y){
        super(x, y);
    }

    public int multiply(int x, int y){
        return super.multiply();
    }
}

class ExceptionSuperClass {
    public static void main(String[] args) {
        ExceptionB exceptionB = new ExceptionB(5,0);
        System.out.println(exceptionB.divide());

        ExceptionB exceptionC = new ExceptionC(0,0);
        System.out.println(exceptionC.multiply());
    }
}