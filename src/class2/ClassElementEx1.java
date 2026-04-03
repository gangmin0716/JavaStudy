package class2;

public class ClassElementEx1 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 8);

        System.out.println("넓이: " + rec.calculateArea());
        System.out.println("둘레 길이: " + rec.calculatePerimeter());
        System.out.println("정사각형 여부: " + rec.isSquare());
    }
}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
    public int calculatePerimeter() {return 2 * (width + height);}
    public boolean isSquare() {
        return this.width == this.height;
    }

}