package IntermediateJavaPrograms;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" 0 to close \n Enter numbers seperated by space: ");
        int out_val = 0;
        int count = 0;
        while (true){
            int num = in.nextInt();
            if (num == 0)
                break;
            out_val = out_val + num;
            count++;
        }
        System.out.println("Average of numbers: " + out_val/count);
    }
}
