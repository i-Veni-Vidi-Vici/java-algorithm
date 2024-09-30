package greedy._87_gas_station_134;

public class Practice2 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0; i< gas.length; i++){
            int count =0;
            int sum=gas[i];
            int index = i;
            while(count < gas.length){
                if(sum-cost[(index)%gas.length]>=0){
                    sum =sum+ gas[(index+1)%gas.length]-cost[(index)%gas.length];
                } else{
                    i= index;
                    break;
                }
                count++;
                index++;
            }
            if(count == gas.length){
                return i;
            }
        }
        return -1;
    }

    // 5ms
}
