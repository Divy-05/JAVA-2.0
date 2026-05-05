import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] rollNo = new int[4];
        rollNo[0] = 1;
        rollNo[1] = 2;
        rollNo[2] = 3;
        rollNo[3] = 4;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < rollNo.length; i++) {
            rollNo[i] = in.nextInt();
        }
        in.close();
        for (int i = 0; i < rollNo.length; i++) {
            System.out.println(rollNo[i]);
        }
    }
}