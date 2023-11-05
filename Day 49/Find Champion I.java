class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int champion = 0;

        for (int i = 0; i < n; i++) {
            if (grid[i][champion] == 1) {
                champion = i; // Update champion to the current column index
            }
        }

        return champion;
    }
}
