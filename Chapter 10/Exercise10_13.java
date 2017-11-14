class Shape {
   // abstract double getArea();
}

abstract class TwoDimensionalShape extends Shape {
    protected double base, height;
    public TwoDimensionalShape(double base, double height){
        this.base = base;
        this.height = height;
    }

    public abstract double getArea();
    public abstract String toString();
 }
 
 abstract class ThreeDimensionalShape extends Shape {
    protected double x1, y1, z1;

    public ThreeDimensionalShape (double base, double height, double z1){
        this.x1 = base;
        this.y1 = height;
        this.z1 = z1;
    }

    public abstract double getArea();
    public abstract double getVolume();
    public abstract String toString();
 }

 class Cube extends ThreeDimensionalShape {
     public Cube (int x1, int y1, int z1){
        super(x1, y1, z1);
     }

     public double getArea(){
         return (super.x1*2)*6;
     }

     public double getVolume(){
         return (super.x1*3);
     }

     public String toString(){
         return "Shape name : Cube\nArea : "+getArea()+"\nVolume : "+getVolume();
     }
 }


 class Square extends TwoDimensionalShape{
    public Square (double base, double height) {
        super(base, height);
    }

    public double getWidth(){
        return super.base;
    }

    public double getHeight(){
        return super.height;
    }
    
    public double getArea(){
        return (super.base * 4);
    }

    public String toString(){
        return "Shape name : Square\nArea : "+getArea()+" ";
    }
}

class Rectangle extends TwoDimensionalShape{
    public Rectangle (double base, double height) {
        super(base, height);
    }

    public double getWidth(){
        return super.base;
    }

    public double getHeight(){
        return super.height;
    }
    
    public double getArea(){
        return (super.base * super.height);
    }

    public String toString(){
        return "Shape name : Rectangle\nArea : "+getArea()+" ";
    }
}

class TriAngle extends TwoDimensionalShape{
    public TriAngle(int base, int height){
        super(base, height);
    }

    public double getbase(){
        return super.base;
    }

    public double getHeight(){
        return super.height;
    }

    public double getArea(){
        return ((super.base/2)*super.height);
    }

    public String toString(){
        return "Shape name : Triangle\nArea : "+getArea()+" ";
    }
}

class Sphere extends ThreeDimensionalShape{
    public Sphere(int x1,int y1,int z1){
        super(x1,y1,z1);
    }

    public double getRadius(){
        return super.x1;
    }

    public double getArea(){
        return ((super.x1*2)*2.32322);
    }

    public double getVolume(){
        return ((super.x1)*(2.32322/(4/3)));
    }

    public String toString(){
        return "Shape name : Sphere\nArea : "+getArea()+" ";
    }
}

class Exercise10_13{
    public static void main(String[] args) {

        Shape [] shape = new TwoDimensionalShape[6];
        shape[0] = new Square(5,5);
        shape[1] = new Rectangle(3,5);
        shape[2] = new TriAngle(3,5);

        System.out.println("\nTWo dimensional Shapes");
        for (int i=0;i<3;i++)
            System.out.println(shape[i].toString());

        shape = new ThreeDimensionalShape[3];
        shape[0] = new Cube(5,5,9);
        shape[1] = new Sphere(3,5,8);

        System.out.println("\n\nThree dimensional Shapes");
        for (int i=0;i<2;i++)
            System.out.println(shape[i].toString());
    }
}