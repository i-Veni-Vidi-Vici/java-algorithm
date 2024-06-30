package greedy._87_gas_station_134;

public class Practice1 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; ) {
            int sum = 0;
            int result =i;
            boolean checked = false;
            for (int j = i; j < result + gas.length; j++) {
                if (sum + gas[j % gas.length] >= cost[j % gas.length]) {
                    i++;
                    sum += gas[j % gas.length]-cost[j % gas.length];
                    checked = true;
                } else {
                    i++;
                    checked = false;
                    break;
                }
            }
            if (checked) {
                return result;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
    }

    // 5ms O(n)
}
