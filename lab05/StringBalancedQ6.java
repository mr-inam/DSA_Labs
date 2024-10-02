import java.util.*;
public class StringBalancedQ6 {
    static boolean isBalanced(String str){
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '('|| c == '{'||c == '['){
                list.push(c);
            } else if(c == ')'|| c == '}'||c == ']'){
                if(list.isEmpty()){
                    return false;
                }
                char popped = list.pop();
                if(popped == '(' && c != ')'){
                    return false;
                } else if(popped == '{' && c != '}'){
                    return false;
                } else if(popped == '[' && c != ']'){
                    return false;
                }
            }
            
        }
        return list.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("isBalanced: "+isBalanced(""));
    }
}
