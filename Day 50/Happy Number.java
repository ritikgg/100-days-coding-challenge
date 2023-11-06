class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        } while (slow != fast);
        
        return slow == 1;
    }
    
    private int getSumOfSquares(int n) {
        int plus = 0;
        while (n > 0) {
            int number = n % 10;
            plus += number * number;
            n /= 10;
        }
        return plus;
    }
}
