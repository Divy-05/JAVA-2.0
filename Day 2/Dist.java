import java.util.Scanner;

public class Dist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter the coordinates of the second point: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("The distance between the two points is: " + distance);
    }
}