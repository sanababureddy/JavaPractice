import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
        Factorial of a number program
        0! = 1
        1! = 1
        2! = 1*2 = 2
        3! = 1*2*3 = 6
        4! = 1*2*3*4 = 24

         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double cal=1;
        if(n==1 || n== 0){
            System.out.println(1);
        }
        else {
            for(int i=n;i>=1;i--){
                cal = cal*i;
            }
            System.out.println(cal);
        }


    }
}
