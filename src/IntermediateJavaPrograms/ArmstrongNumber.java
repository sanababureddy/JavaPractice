package IntermediateJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //153 = 1^3 + 2^3 + 3^3
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int lastNumber;
        int val =0;
        int c;
        while (num>0){
            lastNumber = num%10;
            c=lastNumber*lastNumber*lastNumber;
            val = val + c;
            num = num / 10;
        }
        if (temp == val)
            System.out.println("Number is Armstrong Number");
        else
            System.out.println("Number is not Armstrong Number");
    }
}
