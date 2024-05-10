package bitmanipulation._79_utf_8_validation_393;

public class Main1 {
    public static boolean validUtf8(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (count == 0) {
                for (int j = 7; j >= 0; j--) {
                    if (((1 << j) & data[i]) == (1 << j)) {
                        count++;
                    } else {
                        if (count >= 5) {
                            return false;
                        }
                        if (count >= 2) {
                            count--;
                        }
                        if (count == 1) {
                            return false;
                        }
                        break;
                    }

                }
            } else {
                if (((1 << 7) & data[i]) == (1 << 7) && ((1 << 6) & data[i]) == 0) {
                    count--;
                } else return false;
            }
        }

        if (count != 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        validUtf8(new int[]{32,196,147,225,184,165,246,149,170,129,204,153,243,188,141,147,0,217,149,234,176,176,243,178,133,144,213,181,193,187,238,137,134,218,155,33,231,134,162,243,184,144,131,71,201,131,244,133,189,140,242,178,128,156,207,154,230,165,181,240,181,134,180,227,129,199,172,226,158,164,214,183,224,137,141,20,194,188,232,177,151,242,157,180,153,200,189,239,153,186,240,153,181,154});
    }

    // 2ms
}

