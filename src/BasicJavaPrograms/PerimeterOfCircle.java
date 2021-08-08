import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter Radious of the Circle: ");
        float r = in.nextFloat();
        System.out.println("Perimeter of the circle: " + 2*pi*r);
    }
}
