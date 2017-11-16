class SomeClass extends Exception{
    public SomeClass(){}
    public SomeClass(String msg) throws SomeClass{
        super(msg);
        throw new SomeClass();
    }
}

class ConstructorFailure{
    public static void main(String[] args) {
        try{
            SomeClass someClass = new SomeClass("food");
        }
        catch(SomeClass e){
            System.out.println(e);
        }
    }
}