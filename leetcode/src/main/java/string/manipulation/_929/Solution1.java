package string.manipulation._929;

import java.util.*;
public class Solution1 {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            // '@'를 기준으로 로컬 이름과 도메인 이름을 분리
            String[] parts = email.split("@");
            String localName = parts[0];
            String domainName = parts[1];

            // 로컬 이름에서 '+' 이후의 모든 문자 제거
            int plusIndex = localName.indexOf('+');
            if (plusIndex != -1) {
                localName = localName.substring(0, plusIndex);
            }

            // 로컬 이름에서 모든 '.' 제거
            localName = localName.replace(".", "");

            // 정제된 이메일 주소 생성
            String cleanedEmail = localName + "@" + domainName;
            uniqueEmails.add(cleanedEmail);
        }

        return uniqueEmails.size();
    }
    // 14ms
}
