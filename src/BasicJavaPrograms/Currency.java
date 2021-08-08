import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NumberFormat inF = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        double num = input.nextDouble();


        System.out.println(inF.format(num));
        System.out.println(usF.format(num));

    }
}
