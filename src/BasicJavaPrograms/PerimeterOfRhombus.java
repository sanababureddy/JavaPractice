import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of Rhombus: ");
        float a = in.nextFloat();

        System.out.println("Perimeter of Rhombus is : " + 4*a);
    }
}
