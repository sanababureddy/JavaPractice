package IntermediateJavaPrograms;

public class switchTest {
    public static void main(String[] args) {
        test("color");
    }
    static void test(String ruleKey){
        int colIndex = 0;
        switch(ruleKey){
            case "type":
                colIndex = 0;
                break;
            case "color":
                colIndex = 1;
                break;
            case "name":
                colIndex = 2;
                break;
        }
        System.out.println(colIndex);
    }
}
