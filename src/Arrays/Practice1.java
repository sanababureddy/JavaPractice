package Arrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] b = new boolean[candies.length];
        int max = candies[0];
        for (int i=1;i<candies.length;i++){
            if (candies[i] > max)
                max = candies[i];
        }
        List<Boolean> output = new ArrayList<>();

        for (int i=0;i<candies.length;i++){
            if (candies[i]+extraCandies >= max)
               output.add(true);
            else
                output.add(false);
        }


        return output;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        kidsWithCandies(candies,extraCandies);


    }
}
