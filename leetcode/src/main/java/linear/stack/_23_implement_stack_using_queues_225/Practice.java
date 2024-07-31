package linear.stack._23_implement_stack_using_queues_225;

import java.util.ArrayDeque;
import java.util.Queue;

public class Practice {
    class MyStack {
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> prev = new ArrayDeque<>();
        int top;
    public MyStack() {
    }

    public void push(int x) {
        top = x;
        queue.add(x);
        queue.addAll(prev);
        prev = queue;
        queue.clear();


    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
    }

    // ConcurrentModificationException
}
