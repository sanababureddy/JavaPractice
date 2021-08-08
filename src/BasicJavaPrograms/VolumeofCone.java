import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radious and height of Cone: ");
        float pi = 3.14f;
        float r = in.nextFloat();
        float h = in.nextFloat();

        System.out.println("Volume of Cone is : " + pi*r*r*(h/3));
    }
}
