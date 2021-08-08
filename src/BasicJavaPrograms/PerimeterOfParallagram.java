import java.util.Scanner;

public class PerimeterOfParallagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base and side of Parllagram: ");
        float b = in.nextFloat();
        float a = in.nextFloat();

        System.out.println("Perimeter of Parallagram is : " + 2*(a+b));
    }
}
