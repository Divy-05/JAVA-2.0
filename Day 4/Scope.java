public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // int a = 11;
            int c = 11;
            System.out.println(c);
        }
        System.out.println(a);
    }
    static void random(int marks){
        int num = 100;
        System.out.println(num);
        System.out.println(marks);
    }
}