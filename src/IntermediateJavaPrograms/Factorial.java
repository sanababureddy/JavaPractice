package IntermediateJavaPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /* 0! = 1
        1! = 1
        2! = 2
        3! = 6
        4! = 1*2*3*4 = 24
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int fact=1;
        if (n>=1) {
            for (int i = 1; i <= n; i++) {
                fact = fact *i;
            }
        }

        System.out.println("Factorial is: " + fact);


    }
}
