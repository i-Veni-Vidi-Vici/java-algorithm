package linear.stack._24_implement_queue_using_stacks_232;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice1 {
   static class MyQueue {
        Deque<Integer> value = new ArrayDeque<>();
        public MyQueue() {

        }

        public void push(int x) {
            Deque<Integer> tmp = new ArrayDeque<>();
            int valueSize = value.size();
            for (int i = 0; i <valueSize ; i++) {
                tmp.push(value.pop());
            }
            value.push(x);
            int tmpSize = tmp.size();
            for (int i = 0; i < tmpSize; i++) {
                value.push(tmp.pop());
            }
        }

        public int pop() {
            return value.pop();
        }

        public int peek() {
            return value.peek();
        }

        public boolean empty() {
            return value.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        myQueue.pop();
        myQueue.push(5);

        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
    }
    // 0ms
}
