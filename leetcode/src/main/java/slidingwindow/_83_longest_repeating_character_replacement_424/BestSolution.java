package slidingwindow._83_longest_repeating_character_replacement_424;

// TODO : Map -> Array
public class BestSolution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        char[] ans = s.toCharArray();
        int left = 0;
        int max = 0;
        for (int right = 0; right < ans.length; right++) {
            arr[ans[right] - 'A']++;
            max = Math.max(max, arr[ans[right] - 'A']);

            while ((right - left + 1) - max > k) {   //main line...
                arr[ans[left++] - 'A']--;
            }
        }
        return ans.length - left;
    }
    // 3~4ms
}
