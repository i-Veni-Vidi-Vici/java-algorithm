package string.manipulation.detect_capital_520;

public class Practice1 {
    public boolean detectCapitalUse(String word) {
        String val = word.substring(0,1).toUpperCase() +  word.substring(1).toLowerCase();
        return word.toUpperCase().equals(word) || word.toLowerCase().equals(word)
                || val.equals(word);
    }
    // 2ms
}
