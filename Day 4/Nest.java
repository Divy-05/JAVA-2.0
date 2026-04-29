import java.util.Scanner;

public class Nest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rollNo = in.nextInt();

        switch (rollNo) {
            case 1:
                System.out.println("Name is Divy");
                break;
            case 2:
                System.out.println("Name is Yash");
                break;
            case 3:
                System.out.println("Name is Patel");
                break;
            default:
                System.out.println("Name is not Divy,Yash,Patel");
                break;
        }
    }
}
