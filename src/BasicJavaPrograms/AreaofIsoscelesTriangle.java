import java.util.Scanner;

public class AreaofIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter Base and Height of the Triangle: ");
        float b = in.nextFloat();
        float h = in.nextFloat();
        System.out.println("Area of Osceles Triangle: " + b*h/2);
    }
}
