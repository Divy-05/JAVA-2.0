import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = greeet();
        // System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        
        String person = myGreet(name);
        System.out.println(person);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;   
    }

    static String greeet(){
        String greeting = "Hello Divy";
        return greeting;
    }
}