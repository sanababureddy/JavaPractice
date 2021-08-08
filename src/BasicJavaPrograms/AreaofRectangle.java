import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width and height of the Rectangle");
        float w = in.nextFloat();
        float h = in.nextFloat();

        System.out.println("Area of the Rectangle: " + w*h);
    }
}
