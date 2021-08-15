package IntermediateJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyFirst {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(90);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list,cmp);
    }
}
