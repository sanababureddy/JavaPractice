import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);

        if(c>='a' && c<='z'){
            System.out.println("Lower Case");
        }
        if (c>='A' && c<='Z'){
            System.out.println("Upper Case");
        }

    }
}
