class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasT = 0, costT = 0;
        
        for(int i = 0 ; i < gas.length ; i++){

            gasT += gas[i];
            costT += cost[i];

        }

        if(gasT < costT) return -1;

        int tank = 0, index = 0;

        for(int i = 0 ; i < gas.length ; i++){
            tank = tank + gas[i] - cost[i];

            if(tank < 0){
                tank = 0;
                index = i + 1;
            }
        }
        return index;   
    }
}