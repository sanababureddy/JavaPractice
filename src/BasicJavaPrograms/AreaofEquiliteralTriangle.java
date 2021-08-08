import java.util.Scanner;

public class AreaofEquiliteralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side value: ");
        float a = in.nextFloat();
        //formula root(3)/4 a^2
        //root(3)/4 = 0.433
        float f1 = 0.433f;
        System.out.println("Area of Equiliteral Triangle: " + f1*a*a);
    }
}
