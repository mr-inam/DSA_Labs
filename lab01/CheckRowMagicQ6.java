import java.util.Scanner;

public class CheckRowMagicQ6 {

    static boolean isRowMagic(int arr[][]) {
        for (int i = 1; i < arr.length; i++) {
            if (countRow(arr[i]) != countRow(arr[i-1])) return false;
        }
        return true;
    }

    static int countRow(int arr[]) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n += arr[i];
        }
        return n;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the (3x3) array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        if (isRowMagic(arr)) System.out.println("The row is magic!");
        else System.out.println("The row is not magic!");
    }
}
