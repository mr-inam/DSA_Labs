import java.util.Scanner;

public class VerticallyFlipQ9 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the (3x3) array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Vertically flipped array: ");
        for (int j = 2; j >= 0; j--) {
            for (int i = 0; i < 3; i++) {
                System.out.print(" "+ arr[j][i]);
            }
            System.out.println();
        }
    }
}
