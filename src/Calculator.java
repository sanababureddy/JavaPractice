import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char op;
        int a;
        int b;
        int result =0;
        while(true) {
            System.out.print("Enter Operation: ");
            op = in.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter 2 numbers: ");
                a = in.nextInt();
                b = in.nextInt();
                if (op == '+')
                    result = a+b;
                else if(op == '-')
                    result = a-b;
                else if(op == '*')
                    result = a*b;
                else if(op == '/') {
                    if (b!=0)
                         result = a / b;
                }
                else if(op == '%')
                    result = a%b;
            } else if (op =='x' || op == 'X'){
                break;
            } else {
                System.out.println("Unknown Operation");
            }
            System.out.println(result);
        }
    }
}
