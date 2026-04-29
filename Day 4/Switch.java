import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        
        // switch (fruit) {
        //     case "apple":
        //         System.out.println("fruit is apple");
        //         break;
        //     case "mango":
        //         System.out.println("fruit is mango");
        //         break;
        //     case "orange":
        //         System.out.println("fruit is orange");
        //         break;
        //     default:
        //         System.out.println("fruit is not apple,mango,orange");
        //         break;
        // }

        switch (fruit) {
            case "apple" -> System.out.println("fruit is apple");
            case "mango" -> System.out.println("fruit is mango");
            case "orange" -> System.out.println("fruit is orange");
            default -> System.out.println("fruit is not apple,mango,orange");
        }
    }
}