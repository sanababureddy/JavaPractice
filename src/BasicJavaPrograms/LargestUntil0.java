import java.util.Scanner;

public class LargestUntil0 {
    public static void main(String[] args) {
        int outNum =0;
        Scanner input = new Scanner(System.in);
        int n;

        while (true){
            n=input.nextInt();
            if (n==0){
                break;
            } else {
                if(n>outNum){
                    outNum = n;
                }
            }
        }
        System.out.println(outNum);
    }
}
