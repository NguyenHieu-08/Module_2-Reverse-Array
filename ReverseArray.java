
import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr;

        Scanner inputArray = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int size = inputArray.nextInt();

        arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.printf("Nhập phân thứ %d: ", i);
            arr[i] = inputArray.nextInt();
        }

        System.out.println("Mảng nhập: " + Arrays.toString(arr));


        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.print("Mảng mới: " + Arrays.toString(arr));
    }
}