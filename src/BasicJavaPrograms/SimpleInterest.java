import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float principle = input.nextFloat();
        System.out.print("Enter Rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter Time: ");
        float time = input.nextFloat();


        float simpleInterest = principle*time*rate/100;

        System.out.println("Simple Interest: "+simpleInterest);

    }
}
