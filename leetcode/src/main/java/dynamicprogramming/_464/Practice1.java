package dynamicprogramming._464;

public class Practice1 {
    Map<Integer, Boolean> memo = new HashMap<>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int totalSum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (totalSum < desiredTotal) return false;

        if (desiredTotal <= 0) return true;

        return canWin(0, desiredTotal, maxChoosableInteger);
    }

    private boolean canWin(int usedNumbers, int remainingTotal, int max) {
        if (memo.containsKey(usedNumbers)) {
            return memo.get(usedNumbers);
        }

        for (int i = 1; i <= max; i++) {
            int curBit = 1 << (i - 1);

            if ((usedNumbers & curBit) != 0) continue;

            if (i >= remainingTotal || !canWin(usedNumbers | curBit, remainingTotal - i, max)) {
                memo.put(usedNumbers, true);
                return true;
            }
        }

        memo.put(usedNumbers, false);
        return false;
    }
}
