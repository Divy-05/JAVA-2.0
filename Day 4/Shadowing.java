public class Shadowing {

    static int x = 40;    // 1. Global variable

    public static void main(String[] args) {
        System.out.println(x);
            int x = 10;           // 2. Local variable (main method)
        System.out.println(x);
        fun();
    }

    static void fun(){
        // int x = 20;           // 3. Local variable (fun method)
        System.out.println(x);
        // System.out.println(Shadowing.x);  // Using class name
    }
}
