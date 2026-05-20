import java.util.Arrays;

public class Large {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4, 2, 1, 23,1,2};
        System.out.println(Largest(arr));
        System.out.println(Smallest(arr));
    }
    static int Largest(int arr[]){
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }
        return Largest;
    }
    static int Smallest(int arr[]){
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < Smallest) {
                Smallest = arr[i];
            }
        }
        return Smallest;
    }
}
