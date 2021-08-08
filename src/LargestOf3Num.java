import java.util.Scanner;

public class LargestOf3Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max=0;

//        max = a;
//        if(max<b){
//            max = b;
//        }
//        if (max<c){
//            max = c;
//        }
        max=Math.max(a,Math.max(b,c));
        System.out.println(max);

    }
}
