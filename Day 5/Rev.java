public class Rev {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4, 2, 1};
        
        reverse(arr);

        // print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}