class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int weeks = n / 7; 
        int days = n % 7;   

        
        total += 28 * weeks + 7 * (weeks - 1) * weeks / 2;
        total += days * (days + 1) / 2 + weeks * days;
        
        return total;
    }
}
