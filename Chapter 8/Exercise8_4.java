class Rectangle{
    private float lenght, width;
    Rectangle (){
        lenght = 1;
        width = 1;
    }

    float getWidth(float x){
        return width;
    }

    float getLenght(float x){
        return lenght;
    }

    void setWidth(float x){
        width = x;
    }

    void setLenght(float x){
        lenght = x;
    }

    float getPerimeter(){
        return 2*(lenght+width);
    }

    float getArea(){
        return width*lenght;
    }
}

class Exercise8_4{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.setWidth(20);
        rect.setLenght(40);

        System.out.println("Area = "+rect.getArea());
        System.out.println("Perimeter = "+rect.getPerimeter());
    }
}