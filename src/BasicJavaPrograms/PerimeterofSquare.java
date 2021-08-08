import java.util.Scanner;

public class PerimeterofSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        float a = in.nextFloat();

        System.out.println("Perimeter of Square is : " + 4*a);
    }
}

