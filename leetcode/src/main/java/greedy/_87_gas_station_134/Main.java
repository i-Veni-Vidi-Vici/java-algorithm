package greedy._87_gas_station_134;

public class Main {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int result =0;
            if (gas[i] - cost[i]>=0) {
                for (int j = i; j < gas.length; j++) {
                    result += gas[j] - cost[j];
                    if (result < 0) {
                        break;
                    }
                }
                if (result < 0) {
                    continue;
                }
                for (int j = 0; j < i; j++) {
                    result += gas[j] - cost[j];
                    if (result < 0) {
                        break;
                    }
                }
                if (result >= 0) {
                    return i;
                }

            }
        }

        return -1;
    }

    // Time Limit Exceeded
}
