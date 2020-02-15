package com.mambainspired;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid(""));
        System.out.println(isValid("(])"));
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        // Declare stack
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(')');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else
                        stack.push('}');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        stack.push(']');
                    break;
                default:
                    break;
            }
        }
        if (!stack.isEmpty())
            return false;
        else
            return true;
    }
}
