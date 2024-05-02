package sort._70_binary_search_704;

import java.util.Arrays;

// TODO : 이진 검색 메서드
public class Solution4 {
    public int search(int[] nums, int target) {
        // 자바의 이진 검색 메소드 호출, 찾는 값이 없으면 0 미만 값이 나오기 때문에 이 경우 -1 리턴
        return Arrays.binarySearch(nums, target) >= 0 ? Arrays.binarySearch(nums, target) : -1;
    }

//    public static void main(String[] args) {
//        int mid = (Integer.MAX_VALUE-2 + Integer.MAX_VALUE) >>> 1;
//        int mid2 = (Integer.MAX_VALUE - 2 + Integer.MAX_VALUE) / 2;
//        int a = (Integer.MAX_VALUE - 2 + Integer.MAX_VALUE);
//        System.out.println(mid);
//        System.out.println(mid2);
//        System.out.println(a);
//        System.out.println(Integer.MAX_VALUE);
//    }
}
