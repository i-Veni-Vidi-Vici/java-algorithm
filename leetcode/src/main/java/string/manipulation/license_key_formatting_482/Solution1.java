package string.manipulation.license_key_formatting_482;

public class Solution1 {
    public String licenseKeyFormatting(String s, int k) {
        // 대시 제거하고 대문자로 변환
        String cleaned = s.replace("-", "").toUpperCase();

        // 빈 문자열이면 바로 반환
        if (cleaned.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int len = cleaned.length();

        // 첫 번째 그룹의 문자 개수 계산
        int firstGroupSize = len % k;
        if (firstGroupSize == 0) firstGroupSize = k;

        // 첫 번째 그룹 추가
        result.append(cleaned.substring(0, firstGroupSize));

        // 나머지 그룹들 추가
        for (int i = firstGroupSize; i < len; i += k) {
            result.append('-');
            result.append(cleaned.substring(i,i + k));
        }

        return result.toString();
    }
    // 12ms
}
