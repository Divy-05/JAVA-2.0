import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();
        System.out.println(n1 + n2 + n3 + n4 + n5);
    }
}