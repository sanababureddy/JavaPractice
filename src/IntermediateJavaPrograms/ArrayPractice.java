package IntermediateJavaPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//        ArrayList<Integer> li = new ArrayList<>();
//        li.add(5);
//        li.add(6);
//        li.add(8);
//        li.add(9);
//        for (int i = 0; i < li.size(); i++) {
//            System.out.println(li.get(i)    );
//        }

        Scanner in = new Scanner(System.in);
//        ArrayList<String> st = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            st.add(in.next());
//        }
//
//        for (int i = 0; i < st.size(); i++) {
//            System.out.print(st.get(i) + ", ");
//        }

        ArrayList<ArrayList<String>> lis = new ArrayList<>();
        int rows = in.nextInt();
        for (int i = 0; i < rows; i++) {
            lis.add(new ArrayList<>());
        }
        System.out.println(lis.size());
        for (int i = 0; i < lis.size(); i++) {
            for (int j = 0; j < 3; j++) {
                lis.get(i).add(in.next());
            }
        }

        System.out.println(lis);

    }
}
