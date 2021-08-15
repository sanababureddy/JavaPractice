package IntermediateJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    Integer x;
    public static void main(String []args) {
        new Employee().get(5);
    }
    void get(Integer i){
        System.out.println(x + ++i);
    }
}
