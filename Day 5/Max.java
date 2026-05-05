import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5,};
        System.out.println(maxrange(arr, 2, 3));
    }

    static int maxrange(int[] arr, int start, int end) {
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}