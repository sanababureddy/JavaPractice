import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        float pi = 3.141f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radious of the Circle: ");
        int r = in.nextInt();

        float area = pi * r * r;

        System.out.println("Area of the Circle: " + area);
    }
}
