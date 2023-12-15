class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the quotient
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Take the absolute values to simplify the division
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            long multiple = 1;

            // Use bitwise left shift to find the largest multiple of divisor that is less than or equal to dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the multiple of divisor from dividend and update the result
            absDividend -= tempDivisor;
            result += multiple;
        }

        return sign * result;
    }
}
