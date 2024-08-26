import java.util.Scanner;

public class CheckColumnMagicQ7 {
    static boolean isColMagic(int arr[][]) {
        for (int i = 1; i < arr.length; i++) {
            int n = 0, m = 0;
            for (int j = 0; j < arr.length; j++) {
                n += arr[j][i-1];
            }
            for (int j = 0; j < arr.length; j++) {
                m += arr[j][i];
            }
            if (n != m) {
                return false;
            }
        }
        return true;
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
        if (isColMagic(arr)) System.out.println("The Column is magic!");
        else System.out.println("The Column is not magic!");
    }
}
