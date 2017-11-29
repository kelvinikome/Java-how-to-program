
class LambdaMultiplication{
    public interface Multiply{
        double multiply(double x, double y);
    }

    public interface Message{
        void show();
    }

    public static void main(String[] args) {
        Multiply multiply = (x, y) -> {return x * y;};
        System.out.println(multiply.multiply(7, 2));

        Message message = () -> System.out.println("Welcome to Lambdas");
        message.show();
    }
}