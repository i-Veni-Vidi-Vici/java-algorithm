package linear.stack.implementstackusingqueues225;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static class MyStack {

        Queue<Integer> queue = new LinkedList<>();
        int value = 0;


        public MyStack() {

        }

        public void push(int x) {
            queue.add(x);
            value = x;
        }

        public int pop() {
            queue.remove(value);
            return value;
        }

        public int top() {
            return value;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }


    // error

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
