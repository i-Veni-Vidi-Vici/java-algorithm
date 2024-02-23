package linear.stack.implementqueueusingstacks232;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    Deque<Integer> stack = new ArrayDeque<>();
    public void push(int x) {
        stack.addFirst(x);
    }

    public int pop() {
       return stack.pop();
    }

    public int peek() {
       return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
