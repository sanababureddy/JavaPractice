import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b){
            System.out.println(a + " is greator");
        }

        else if (a==b){
            System.out.println("numbers are equal");
        }
        else {
            System.out.println(b+" is greator");
        }
    }
}
