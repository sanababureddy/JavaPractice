import java.util.Scanner;

public class AreaofParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and Height of the Parallelogram: ");
        float b = in.nextFloat();
        float h = in.nextFloat();
        System.out.println("Area of Parallelogram: " + b*h);
    }
}
