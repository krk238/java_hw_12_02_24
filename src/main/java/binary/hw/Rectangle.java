package binary.hw;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        System.out.println(length * width);
    }

    public void perimeter() {
        System.out.println((2*length) + (2*width));
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(30, 20);
        rec1.area();

    }
}
