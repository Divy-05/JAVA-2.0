public class Overload {
    public static void main(String[] args) {
        fun(0);
        fun("divy");
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 5));
    }
    // void is for overloading
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    // int is for returning
    static int sum(int a, int b){
        return a + b;
    }
}
