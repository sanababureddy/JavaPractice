import java.util.Scanner;

public class FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        /*factors of 8 is
        1*8
        2*4

        1,2,4,8 are factors

        * */

        for (int i =1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
