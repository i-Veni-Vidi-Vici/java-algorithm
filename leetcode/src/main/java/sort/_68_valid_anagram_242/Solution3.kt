package sort._68_valid_anagram_242

class Solution3 {
    fun isAnagram(s: String, t: String): Boolean {
        return String(s.toCharArray().apply { sort() }) ==
                String(t.toCharArray().apply { sort() })
    }
}