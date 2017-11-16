class SomeClass extends Exception{
    public SomeClass(){}
    public SomeClass(String msg) throws SomeClass{
        super(msg);
        throw new SomeClass();
    }
}

class CatchingOuterScopeExceptions{
    public static void generateException() throws SomeClass{
        try{
            throw new SomeClass();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void catchOuterException(){
        try{
            generateException();
        }
        catch(SomeClass e){
            System.out.println("Exception caught\n"+e);
        }
    }

    public static void main(String[] args) {
        catchOuterException();
    }
}