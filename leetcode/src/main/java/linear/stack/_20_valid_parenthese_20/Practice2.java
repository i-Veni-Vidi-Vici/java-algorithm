package linear.stack._20_valid_parenthese_20;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice2 {
    public static boolean isValid(String s) {
        // stack 2개
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> compareStack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            char value = stack.pop();

            if (!compareStack.isEmpty()) {
                char peek = compareStack.peek();

                if ((value == '(' && peek == ')')
                        || (value == '[' && peek == ']')
                        || (value == '{' && peek == '}')) {
                    compareStack.pop();
                }else {
                    compareStack.push(value);
                }
            } else {
                compareStack.push(value);
            }
        }

        if (compareStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isValid("()");
    }

    // 3ms

}
