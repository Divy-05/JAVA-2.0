public class Pascal {
    public static void main(String[] args) {

        int n = 9;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            // print spaces for center alignment
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {

                // first and last element = 1
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }

                System.out.printf("%4d", arr[i][j]);
            }

            System.out.println();
        }
    }
}