import java.util.Scanner;

public class PerimeterOfEquiliteralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of a Triangle: ");
        float a = in.nextFloat();
        System.out.println("Perimeter of Equiliteral Triangle : " + 3*a );
    }
}
