import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num%2 ==0){
        System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }
    }
}
