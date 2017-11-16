class SomeClass extends Exception{
    public SomeClass(){}
    public SomeClass(String msg) throws SomeClass{
        super(msg);
        throw new SomeClass();
    }
}

class RethrowingExceptions{
    public static void someMethod() throws SomeClass{
        try{
            someMethod2();
        }
        catch(SomeClass e){
            throw new SomeClass();
        }
    }

    public static void someMethod2() throws SomeClass{
        throw new SomeClass();
    }

    public static void main(String[] args) {
        try{
            someMethod();
        }
        catch(SomeClass e){
           e.printStackTrace();
        }
    }
}