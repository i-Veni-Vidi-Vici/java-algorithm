package linear.stack._20_valid_parenthese_20;

public class Practice1 {
    public boolean isValid(String s) {
        char[] value = s.toCharArray();

        for (int i = 0; i < value.length; i += 2) {
            if (!((value[i] == '(' && value[i + 1] == ')') || (value[i] == '[' && value[i + 1] == ']')
                    || (value[i] == '{' && value[i + 1] == '}'))) {
                return false;
            }
        }

        return true;
    }

    // error
}
