
class Exercise7_14{
    public static int product (int... in){
        int ret = 0;
        int count = 0;
        for (int i : in){
            if (count++ > 0)
                ret += (in[i]* in[i-1]); 
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(product(2,2,2));
    }
}