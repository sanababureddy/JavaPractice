import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter P and q Diagonl: ");
        float p = in.nextFloat();
        float q = in.nextFloat();
        System.out.println("Area of Rhombus: " + p*q/2);
    }
}
