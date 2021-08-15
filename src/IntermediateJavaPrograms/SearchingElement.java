package IntermediateJavaPrograms;

public class SearchingElement {
    public static void main(String[] args) {
        int[] arr = {3,9,7,8,12,6,15,5,4,10};
        int key = 6;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                System.out.println(key + " found at index " + i);
                System.exit(0);
            }
        }
        System.out.println("Element Not found");
    }
}
