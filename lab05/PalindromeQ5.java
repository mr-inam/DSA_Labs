import java.util.*;
public class PalindromeQ5 {
    static boolean pel(String str){
        Stack<Character> stackForChar = new Stack<>();
        for (int index = 0; index < str.length(); index++) {
            stackForChar.push(str.charAt(index));
        }
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) != stackForChar.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a word to if pelindrome: ");
        String str = scan.next();
        System.out.println(pel(str));
    }   
}