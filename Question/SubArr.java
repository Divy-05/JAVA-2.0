import java.util.ArrayList;
import java.util.Scanner;

public class SubArr {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        System.out.print("Enter target sum: ");
        int target = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(subarraySum(arr, target));
        in.close();
    }
}
