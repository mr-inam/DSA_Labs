import java.util.Scanner;
public class Copy2ArrayIn3rdArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scan.nextInt();
        int[] first = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            first[i] = scan.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scan.nextInt();
        int[] second = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            second[i] = scan.nextInt();
        }
        int[] third = new int[size1 + size2];
        for (int i = 0; i < first.length; i++) {
            third[i] = first[i];
        }
        for (int i = first.length, j = 0; i < third.length; i++, j++) {
            third[i] = second[j];
        }
        System.out.println("The third array is:");
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i] + " ");
        }
    }
}
