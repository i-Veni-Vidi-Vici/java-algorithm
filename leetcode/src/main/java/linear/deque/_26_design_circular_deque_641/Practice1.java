package linear.deque._26_design_circular_deque_641;

import java.util.LinkedList;
import java.util.List;

public class Practice1 {
    class MyCircularDeque {

        List<Integer> value = new LinkedList<>();
        int size;

        public MyCircularDeque(int k) {
            size = k;
        }

        public boolean insertFront(int value) {
            if (!isFull()) {
                this.value.add(0, value);
                return true;
            }

            return false;
        }

        public boolean insertLast(int value) {
            if (!isFull()) {
                this.value.add( value);
                return true;
            }

            return false;
        }

        public boolean deleteFront() {
            if (!isEmpty()) {
                this.value.remove(0);
                return true;
            }

            return false;
        }

        public boolean deleteLast() {
            if (!isEmpty()) {
                this.value.remove(this.value.size()-1);
                return true;
            }

            return false;
        }

        public int getFront() {
            if (!isEmpty()) {
                return value.get(0);
            }

            return -1;
        }

        public int getRear() {
            if (!isEmpty()) {
                return value.get(value.size()-1);
            }

            return -1;
        }

        public boolean isEmpty() {
            return value.isEmpty();
        }

        public boolean isFull() {
            return value.size() == size;
        }
    }

    // 6ms

}
