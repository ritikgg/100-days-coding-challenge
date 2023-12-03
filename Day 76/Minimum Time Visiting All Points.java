class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        
        for (int i = 1; i < points.length; i++) {
            int xDiff = Math.abs(points[i][0] - points[i - 1][0]);
            int yDiff = Math.abs(points[i][1] - points[i - 1][1]);
            
            // diagonal move takes sqrt(2) seconds
            int diagonalMove = Math.min(xDiff, yDiff);
            
            // Calc the remaining vertical or horizontal moves
            int remainingMoves = Math.max(xDiff, yDiff) - diagonalMove;
            
            // Update the total time
            totalTime += diagonalMove + remainingMoves;
        }
        
        return totalTime;
    }
}
