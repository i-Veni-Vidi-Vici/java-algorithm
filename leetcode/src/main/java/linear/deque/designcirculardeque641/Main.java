package linear.deque.designcirculardeque641;

import java.util.LinkedList;
import java.util.List;

public class Main {
    List<Integer> deque = new LinkedList<>();

    int length = 0;
    int size = 0;
    int front = 0;
    int end = 0;

    public Main(int k) {
        length = k;
    }

    public boolean insertFront(int value) {
        if (isEmpty()) {
            front =0;
            end =0;
        }

        if (!isFull()) {
            deque.add(front % length, value);
            end++;
            size ++;
            return true;
        }

        return false;
    }

    public boolean insertLast(int value) {
        if (isEmpty()) {
            front =0;
            end =0;
        }

        if (!isFull()) {
            deque.add(end % length, value);
            end++;
            size ++;
            return true;
        }

        return false;
    }

    public boolean deleteFront() {
        if (!isEmpty()) {
            deque.remove(front% length);
            end--;
            size--;
            return true;
        }

        return false;
    }

    public boolean deleteLast() {
        if (!isEmpty()) {
            deque.remove((end-1)% length);
            end--;
            size--;
            return true;
        }

        return false;
    }

    public int getFront() {
        if (!isEmpty()) {
            return deque.get(front% length);
        }

        return -1;
    }

    public int getRear() {
        if (!isEmpty()) {
            return deque.get((end - 1)%length);
        }

        return -1;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == length);
    }

    public static void main(String[] args) {
        Main a = new Main(3);
        a.insertFront(8);
        a.insertLast(8);
        a.insertLast(2);
        a.getFront();
        a.deleteLast();
        a.getRear();
        a.insertFront(9);
        a.deleteFront();
        a.getRear();
    }

    // 5ms
}
