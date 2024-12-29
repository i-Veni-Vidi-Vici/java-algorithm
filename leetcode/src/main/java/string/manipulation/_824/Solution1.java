package string.manipulation._824;

public class Solution1 {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char firstChar = Character.toLowerCase(words[i].charAt(0));

            StringBuilder newWord = new StringBuilder();

            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' ||
                    firstChar == 'o' || firstChar == 'u') {
                newWord.append(words[i]).append("ma");
            } else {
                newWord.append(words[i].substring(1))
                        .append(words[i].charAt(0))
                        .append("ma");
            }

            for (int j = 0; j <= i; j++) {
                newWord.append('a');
            }

            if (i > 0) {
                result.append(" ");
            }
            result.append(newWord);
        }

        // 2ms
        return result.toString();
    }
}
