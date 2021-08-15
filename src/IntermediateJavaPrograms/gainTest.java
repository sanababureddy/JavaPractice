package IntermediateJavaPrograms;

import java.util.Arrays;

public class gainTest {
    public static void main(String[] args) {
        int[][] mat = new int [4][5];
        int len = mat.length;
        System.out.println(len);
        for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
            System.out.println("i = " + i + " :: " + "j = " + j);
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] mirror = new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0,k= image[0].length-1;j<image[0].length;j++,k--){

                mirror[i][j] = image[i][k];
                //byte b = image[i][j];
                //mirror[i][j] = b==1?0:1;
            }
        }
        return mirror;
    }
}
