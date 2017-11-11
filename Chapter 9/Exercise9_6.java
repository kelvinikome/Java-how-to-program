
class Shape{
    protected static double x1, y1, x2, y2;

    public Shape(double x){
        this.x1 = x;
    }

    public Shape(double x, double y){
        this.x1 = x;
        this.y1 = y;
    }

    public Shape(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double getHeight(){
        return this.x1;
    }

    void setLenght(double x){
        this.x1 = x;
    }

    void setHeight(double y){
        this.y1 = y;
    }

    double getLenght(){
        return this.x1;
    }
}

class Square extends Shape{
    public Square(double x1, double y1){
        super(x1, y1);
    }

    double getWidth(){
        return super.x1;
    }

    double getHeight(){
        return super.y1;
    }

    double getArea(){
        return ((super.x1 + super.y1)*2);
    }
}

class Rectangle extends Shape{
    public Rectangle(double x1, double y1){
        super(x1, y1);
    }

    double getWidth(){
        return super.x1;
    }

    double getHeight(){
        return super.y1;
    }

    double getArea(){
        return ((super.x1 * super.y1));
    }
}

class Exercise9_6{
    public static void main(String[] args) {
        Square square = new Square (2,2);
        Rectangle rectangle = new Rectangle (2,2);

        System.out.println("Area of square = "+square.getArea());
        System.out.println("Area of Rectangle = "+rectangle.getArea());
    }
}