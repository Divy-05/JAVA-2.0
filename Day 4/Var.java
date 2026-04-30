import java.util.Arrays;

public class Var {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
    }

    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}