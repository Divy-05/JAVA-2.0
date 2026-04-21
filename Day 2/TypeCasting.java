import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // float num = input.nextFloat();
        // System.out.println(num);

        // int num = (int) (44.32f);
        // System.out.println(num);

        // int a = 257;
        // byte b = (byte) (a);
        // System.out.println(b);

        // int number1 = 'A';
        // int number2 = 'a';
        // int sum = number1 + number2;
        // System.out.println(sum);

        byte b = 42;
        char c = 'q';
        short s = 102;
        int i = 1000;
        float f = 20.0f;
        double d = 20.0d;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }    
}