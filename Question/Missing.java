import java.util.Scanner;

public class Missing {

    static int missingNumber(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // actual range size
        System.out.print("Enter value of n: ");
        int n = in.nextInt();

        // array size is n-1
        int[] arr = new int[n - 1];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Missing Number: " + missingNumber(arr, n));

        in.close();
    }
}