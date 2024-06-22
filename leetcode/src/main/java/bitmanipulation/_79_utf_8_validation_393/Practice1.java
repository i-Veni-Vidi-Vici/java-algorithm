package bitmanipulation._79_utf_8_validation_393;

public class Practice1 {
//    public boolean validUtf8(int[] data) {
//        int count = 0;
//        for (int i = 0; i < data.length; i++) {
//            if (count > 0) {
//                if (Math.pow(2, 7) <= data[i] && Math.pow(2, 7) + Math.pow(2, 6) - 1 >= data[i]) {
//                    count--;
//                    continue;
//                }
//                return false;
//            }
//            if (Math.pow(2, 7) + Math.pow(2, 6) <= data[i]
//                    && Math.pow(2, 7) + Math.pow(2, 6) + Math.pow(2, 5) - 1 >= data[i]) {
//                count = 1;
//            } else if (Math.pow(2, 7) + Math.pow(2, 6) + Math.pow(2, 5) <= data[i]
//                    && Math.pow(2, 7) + Math.pow(2, 6) + Math.pow(2, 5) + Math.pow(2, 4) - 1 >= data[i]) {
//                count = 2;
//
//            } else if (Math.pow(2, 7) + Math.pow(2, 6) + Math.pow(2, 5) + Math.pow(2, 4) <= data[i]
//                    && Math.pow(2, 7) + Math.pow(2, 6) + Math.pow(2, 5) + Math.pow(2, 4) + Math.pow(2, 3) - 1
//                    >= data[i]) {
//                count = 3;
//
//            } else if (!(Math.pow(2, 7) - 1 >= data[i])) {
//                return false;
//            }
//        }
//        if (count > 0) {
//            return false;
//        }
//
//        return true;
//    }

    public boolean validUtf8(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (count > 0) {
                if (128 <= data[i] && 128 + 64 - 1 >= data[i]) {
                    count--;
                    continue;
                }
                return false;
            }
            if (128 + 64 <= data[i]
                    && 128 + 64 +32 - 1 >= data[i]) {
                count = 1;
            } else if (128 + 64 +32 <= data[i]
                    && 128 + 64 +32 + 16 - 1 >= data[i]) {
                count = 2;

            } else if (128 + 64 +32 + 16 <= data[i]
                    && 128 + 64 +32 + 16 + 8 - 1
                    >= data[i]) {
                count = 3;

            } else if (!(128 - 1 >= data[i])) {
                return false;
            }
        }
        if (count > 0) {
            return false;
        }

        return true;
    }

    // 9ms -> 2ms  Math.pow()-> literal


}
