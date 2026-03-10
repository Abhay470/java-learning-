import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayclasses {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        // System.out.println(Array.get(arr, 0).getClass().getSimpleName());

        int array[][] = new int[4][4];
        System.out.println(array.getClass().getName());
        int ar1[] = { 100, 20, 300, 40 };
        array.sort(ar1);
        for( int elem:ar1){
            System.out.println(elem + "");
        }

    }
}
