import java.util.Scanner;

public class Q7 {
    public static boolean isPalindrome(String str, int start, int end){
        if(start == end) return true;
        if(str.charAt(start) == str.charAt(end)){
            return isPalindrome(str, start+1, end-1);
        } else return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = scan.next();
        System.out.println("isPalindrome: "+isPalindrome(str, 0, str.length()-1));
    }
}
