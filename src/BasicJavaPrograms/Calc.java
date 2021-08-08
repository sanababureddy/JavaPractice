import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String operator = input.next();
        int b = input.nextInt();

        if (operator.equals("+")){
            System.out.println(a+b);
        }else if( operator.equals("-")) {
            System.out.println(a-b);
        } else if(operator.equals("*")){
            System.out.println(a*b);
        } else if (operator.equals("/")) {
            System.out.println(a/b);
        }else {
            System.out.println("Unknown operation");
        }
    }
}
