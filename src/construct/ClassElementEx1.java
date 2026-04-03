package construct;

public class ClassElementEx1 {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        Rectangle rectangle = new Rectangle(width, height);

        int area = rectangle.calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare(area, perimeter);
        System.out.println("정사각형 여부: " + square);
    }
}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * width * height;
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}