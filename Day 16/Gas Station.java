class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int gasCount = 0; 
        int startStation = 0;
        
        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            gasCount += diff;
            
          
            if (gasCount < 0) {
                gasCount = 0;
                startStation = i + 1;
            }
        }
        
        if (totalGas < 0) {
            return -1;
        }
        
        return startStation;
    }
}
