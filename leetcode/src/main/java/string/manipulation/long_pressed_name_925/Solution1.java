package string.manipulation.long_pressed_name_925;

public class Solution1 {
    public boolean isLongPressedName(String name, String typed) {
        if (name == null || typed == null) return false;

        int i = 0; // name의 인덱스
        int j = 0; // typed의 인덱스

        while (j < typed.length()) {
            // 현재 문자가 일치하는 경우
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // 이전 문자가 반복되는 경우 (오래 눌린 경우)
            else if (i > 0 && typed.charAt(j) == name.charAt(i-1)) {
                j++;
            }
            // 일치하지 않는 문자가 나온 경우
            else {
                return false;
            }
        }

        // name의 모든 문자가 처리되었는지 확인
        return i == name.length();
    }
    // 1ms
}
