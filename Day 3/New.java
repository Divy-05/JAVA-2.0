import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        // int salary = 56;
        // if(salary > 100){
        //     salary = salary + 30;
        // }  else if (salary > 50){
        //     salary = salary + 50;
        // } else {
        //     salary = salary + 100;
        // }
        // System.out.println(salary);

        Scanner in = new Scanner(System.in);

        // int n = in.nextInt();

        // for (int i = 0; i < n; i++) {
        //     System.out.println(i +"");
        // }

        int num = 1;
        // while (num <= 5) {
        //     System.out.println(num);
        //     num++;
        // }

        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }
}