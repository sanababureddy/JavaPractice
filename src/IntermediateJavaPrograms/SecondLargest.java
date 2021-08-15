package IntermediateJavaPrograms;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {20,3,9,7,8,12,6,15,5,4,10};
        int firstLargest = arr[0];
        int secondLargest  = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] != firstLargest)
                secondLargest = arr[i];

        }
        System.out.println("Second Max:" + secondLargest);
    }
}
