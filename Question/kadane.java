public class kadane {
    public static int maxSubArraySum(int[] arr) {
        int sum = arr[0];
        int largest = arr[0];

        for (int end = 1; end < arr.length; end++) {
            sum = Math.max(sum + arr[end], arr[end]);
            largest = Math.max(largest, sum);
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -2, 5 };

        System.out.println(maxSubArraySum(arr));
    }
}
