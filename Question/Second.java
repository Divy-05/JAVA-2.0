import java.util.Arrays;

public class Second {
    public static int getSecondLargest(int[] arr) {
        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {                         
                secondLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != Largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 6, 5 };
        System.out.println(Arrays.toString(arr));
        System.out.println(getSecondLargest(arr));

    }
}