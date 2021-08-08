import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length and width of Rectangle: ");
        float l = in.nextFloat();
        float w = in.nextFloat();

        System.out.println("Perimeter of Rectangle is : " + 2*(l+w));
    }
}
