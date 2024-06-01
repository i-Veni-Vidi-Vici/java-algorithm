package nonlinear.heap._60_Kth_Largest_Element_in_an_Array_215;

import java.util.ArrayList;
import java.util.List;

// 이진힙 구현
public class Practice2 {
    static class Heap {
        private final List<Integer> heap;

        public Heap() {
            heap = new ArrayList<>();
            heap.add(null);
        }

        public void insert(int num) {
            heap.add(num);
            int index = heap.size() - 1;

            while (index > 1 && heap.get(index / 2) < num) {
                swap(index, index / 2);
                index /= 2;
            }
        }

        public int pool() {
            int maxValue = heap.get(1);
            heap.set(1, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);

            int index = 1;
            while (((heap.size() - 1) >= index * 2 && (heap.get(index) < heap.get(index * 2))) ||
                    ((heap.size() - 1) >= index * 2 + 1 && (heap.get(index) < heap.get(index * 2 + 1)))) {
                if (((heap.size() - 1) >= index * 2 + 1) && (heap.get(index * 2) < heap.get(index * 2 + 1))) {
                    swap(index, index * 2 + 1);
                    index = index * 2 + 1;
                } else {
                    swap(index, index * 2);
                    index = index * 2;
                }
            }

            return maxValue;
        }

        private void swap(int index1, int index2){
            int temp = heap.get(index2);
            heap.set(index2, heap.get(index1));
            heap.set(index1, temp);
        }
    }

    public int findKthLargest(int[] nums, int k) {
        Heap heap = new Heap();

        for (int num : nums) {
            heap.insert(num);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = heap.pool();
        }

        return result;
    }

    // 122ms
}
