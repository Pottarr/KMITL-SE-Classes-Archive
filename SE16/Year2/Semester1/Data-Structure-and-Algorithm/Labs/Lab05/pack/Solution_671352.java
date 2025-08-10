package pack;

import pack.MyStack;

public class Solution_671352 {

    public static void main(String[] args) {
        boolean q1 = backspaceCompare("ab c", "ad c");
        boolean q2 = backspaceCompare("ab  ", "c d ");
        boolean q3 = backspaceCompare("a c", "b");
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    public static boolean backspaceCompare(String s, String t) {
        if (deleteCharBeforeBackspace(s).equals(deleteCharBeforeBackspace(t))) return true;
        return false;
    }

    public static String deleteCharBeforeBackspace(String str) {
        MyStack<Character> stack = new MyStack<Character>();
        char ch = '/';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == ' ' && !stack.isEmpty()) {
                stack.pop();
                continue;
            }
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
