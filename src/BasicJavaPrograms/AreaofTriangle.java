import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base and Height of the circle:");
        float base=in.nextFloat();
        float height = in.nextFloat();
        float area = height * base / 2;
        System.out.println("Area is: " + area);
    }
}
