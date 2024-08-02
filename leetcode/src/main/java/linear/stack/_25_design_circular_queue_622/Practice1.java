package linear.stack._25_design_circular_queue_622;

public class Practice1 {

    class MyCircularQueue {

        int[] value;
        int front;
        int rear;
        int size;
        int length;

        public MyCircularQueue(int k) {
            value = new int[k];
            front = 0;
            rear = -1;
            size = k;
            length = 0;
        }

        public boolean enQueue(int value) {
            if (!isFull()) {

                rear = (rear + 1) % size;
                this.value[rear] = value;
                length++;
                return true;
            }

            return false;
        }

        public int Front() {
            if (!isEmpty()) {
                return value[front];
            }

            return -1;
        }

        public int Rear() {
            if (!isEmpty()) {
                return value[rear];
            }

            return -1;
        }

        public boolean isEmpty() {
            if (length == 0) {
                return true;
            }

            return false;
        }

        public boolean isFull() {
            if (length == size) {
                return true;

            }
            return false;
        }

        public boolean deQueue() {
            if (!isEmpty()) {
                value[front] = -1;
                front = (front + 1) % size;
                length--;
                return true;
            }

            return false;
        }


    }
    // 4ms

}
