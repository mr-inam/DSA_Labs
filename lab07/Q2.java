import java.util.Arrays;

public class Q2 {
    public static int[] sort(int arr1[], int arr2[]) {
        int[] arr = new int[arr1.length + arr2.length];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr.length; i++) {
            int min;
            if (i != 0) {
                min = arr[i-1];
            }
            for (int j = 0; j < arr1.length; j++) {

            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}