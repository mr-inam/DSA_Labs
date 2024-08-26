import java.util.Scanner;

public class ReverseArrayQ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        int[] reversedArr = new int[size];
        for (int i = 0, j = size-1; i < reversedArr.length; i++) {
            reversedArr[j] = arr[i];
            j--;
        }

        System.out.println("Actual array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reversedArr[i]+" ");
        }
    }
}
