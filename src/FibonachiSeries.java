import java.util.Scanner;

public class FibonachiSeries {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int temp;
        for(int i =2;i<=n;i++){
            temp = num1;
            num1 = num2;
            num2 = temp+num2;
        }
        System.out.println(num1);
    }
}
