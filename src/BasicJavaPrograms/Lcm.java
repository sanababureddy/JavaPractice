import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int i = 1;
        int calc;
        while(true){
            calc = n1 * i;
            if (calc%n2 ==0){
                System.out.println(calc);
                break;
            }
            i++;
        }
    }
}
