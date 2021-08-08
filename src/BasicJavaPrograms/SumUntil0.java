import java.util.Scanner;

public class SumUntil0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        while(true){
            int n = input.nextInt();
            if (n==0){
                break;
            }else {
                sum = sum +n;
            }
        }
        System.out.println(sum);
    }
}
