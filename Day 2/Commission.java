import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount :");

        double amount = input.nextDouble();
        double Commission = 0;


        // find error
        if (amount >= 100) {
            Commission = amount * 0.10;
        } else if (amount >= 500) {
            Commission = amount * 0.05;
        } else if (amount >= 1000) {
            Commission = amount * 0.02;
        }

        System.out.println("Commission = " + Commission);

    }
}
