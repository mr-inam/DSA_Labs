1. Implement binary search using a recursive approach. Also, show its working in the main method.

public class Q1{
    public static int binary(int arr[], int key, int left, int right){
        if(left > right) return -1;
        int mid = left + (right-left)/2;
        if(arr[mid] == key) return mid;
        if(key < arr[mid]){
            return binary(arr, key, left, mid);
        } else
            return binary(arr, key, mid+1, right);
    }
    public static void main(String[] args) {
        int arr[] = {7,4,2,5,9,3,1,6};
        System.out.println("search 5: index-"+binary(arr,5,0,arr.length-1));
    }
}

2. Implement a recursive method to compute the factorial of a given number. Also, show its working in the main method.

public class Q2 {
    public static int fac(int n){
        if(n == 0) return 1;
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println("factorial of "+i+" is "+fac(i));
        }
    }
}












3. Write a program to generate the Fibonacci series till N, where N is a number input by the user. Then, show its working in the main method.

import java.util.Scanner;

public class Q3 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        System.out.println("Fibonacci series of " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}


4. Write a program to reverse stack using a recursive approach.

import java.util.Stack;

public class Q4 {
    public static void reverseStack(Stack<Integer> list){
        if(list.isEmpty()) return;
        Integer n = list.pop();
        reverseStack(list);
        list.addFirst(n);
    }

    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println(list);
        reverseStack(list);
        System.out.println(list);
    }
} 








5. Write a program to print all nodes of a Linked List (using a recursive approach).

import java.util.LinkedList;

public class Q5 {
    public static void print(LinkedList list){
        if(list.isEmpty()) return;
        System.out.print(list.remove()+" ");
        print(list);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        print(list);
        System.out.println();
    }
}






6. Write a program to print all nodes of a Singly Linked List in reverse order (using a recursive approach).

import java.util.LinkedList;

public class Q6 {
    public static void reversePrint(LinkedList<Integer> list){
        if(list.isEmpty()) return;
        var n = list.remove();
        reversePrint(list);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        reversePrint(list);
        System.out.println();
    }
}





7. Write a recursive method that determines if a string s is a palindrome, that is, it is equal to its reverse. A string is said to be a palindrome if the string read from left to right is equal to the string read from right to left. For example, ignoring the diNerence between uppercase and lowercase letters, the string "racecar" is a palindrome, while the string "cake" is not so.

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



























8. Solve the problem of the Towers of Hanoi using recursion.

Note: Sir I tried a lot to understand this question but I could not. I request to explain this in our upcoming class please...
