package linear.stack.validparenthese20;


public class Main {
    public static boolean isValid(String s) {
        String[] value = s.split("");
        int left1 = 0, left2 = 0, left3 = 0;
        int right1 = value.length - 1, right2 = value.length - 1, right3 = value.length - 1;

        boolean bool1 = true, bool2 = true, bool3 = true;

        if ((value.length%2) == 1) {
            return false;
        }

        while (left1 < right1 || left2 < right2 || left3 < right3) {
            if (left1 < right1) {
                if (!value[left1].equals("(")) {
                    if (value[left1].equals(")")) {
                        return false;
                    }
                    left1++;
                } else {
                    if (!value[right1].equals(")")) {
                        if (value[right1].equals("(")) {
                            return false;
                        }
                        right1--;
                        bool1 = false;
                    } else {
                        bool1 = true;
                        left1++;
                        right1--;
                    }
                }
            }

            if (left2<right2) {
                if (!value[left2].equals("[")) {
                    left2++;
                    if (value[left2].equals("]")) {
                        return false;
                    }
                } else {
                    if (!value[right2].equals("]")) {
                        if (value[right2].equals("[")) {
                            return false;
                        }
                        right2--;
                        bool2 = false;
                    } else {
                        bool2 = true;
                        left2++;
                        right2--;
                    }
                }
            }

            if (left3 < right3) {
                if (!value[left3].equals("{")) {
                    if (value[left3].equals("}")) {
                        return false;
                    }
                    left3++;
                } else {
                    if (!value[right3].equals("}")) {
                        if (value[right3].equals("{")) {
                            return false;
                        }
                        right3--;
                        bool3 = false;
                    } else {
                        bool3 = true;
                        left3++;
                        right3--;
                    }
                }
            }
        }

        return (bool1 && bool2 && bool3);
    }

    public static void main(String[] args) {
        isValid("()[]{}");
    }
}
