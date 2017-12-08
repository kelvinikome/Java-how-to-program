class GenericsIsEqualToMethod{
    public static void main(String[] args) {
        System.out.println(isEqualTo("a", "a"));
    }

    public static<T> Boolean isEqualTo(T objectA, T objectB){
        boolean returnValue = false;
        if (objectA.toString().compareTo(objectB.toString()) == 0)
            returnValue = true;
        return returnValue;
    }
}