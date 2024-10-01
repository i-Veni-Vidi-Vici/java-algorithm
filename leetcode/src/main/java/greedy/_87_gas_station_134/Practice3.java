package greedy._87_gas_station_134;

public class Practice3 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        for (int i = 0; i < gas.length; i++) {
            int index = i;
            int count = 0;
            int sum = gas[i];
            while (count < gas.length) {
                if (sum - cost[(index) % gas.length] >= 0) {
                    sum = sum - cost[(index) % gas.length] + gas[(index + 1) % gas.length];
                } else {
                    i = index;
                    break;
                }
                count++;
                index++;
            }

            if (count == gas.length) {
                return i;
            }
        }

        return -1;
    }
    // 5ms
}
