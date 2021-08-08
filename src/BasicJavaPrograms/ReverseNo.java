public class ReverseNo {
    public static void main(String[] args) {
        int num = 234353637;
        /*
        % - get last number
        / - delete last number

        number of 3's
         */

        int count = 0;
        int i = 0;
        while(num>0){
            int rem = num%10;
//            if (rem == 3){
//                count++;
//            }
            System.out.print(rem);
            num = num/10;
        }
        System.out.println(count);

    }
}
