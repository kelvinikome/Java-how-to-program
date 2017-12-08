/*Write a generic class Pair which has two type parameters— F and S —
each representing the type of the first and second element of the pair, respectively. Add get and set
methods for the first and second elements of the pair. [Hint: The class header should be public
class Pair < F , S >. */

class Pair<F, S>{
    private F f;
    private S s;

    public Pair(F f, S s){
        this.f = f;
        this.s = s;
    }

    public F getF(){
        return this.f;
    }

    public S getS(){
        return this.s;
    }

    public void setF(F f){
        this.f = f;
    }

    public void setS(S s){
        this.s = s;
    }
}
class GenericClassPair{
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("food", 2);

        System.out.println(pair.getF() + " " + pair.getS());
    }
}