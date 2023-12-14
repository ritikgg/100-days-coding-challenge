class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
         int n = grid.length;
         int m = grid[0].length;
         int[] rows = new int[n]; //this will keep track for nos of ones in rows
         int[] cols = new int[m];// this will keep track for nos of ones in cols

         for(int i = 0; i<n;i++){ //iterate for ones in rows and cols
             for(int j = 0; j<m;j++){
                 rows[i] += (grid[i][j]==1?1:0);
                 cols[j] += (grid[i][j]==1?1:0);
             }
         }

         int[][] diff = new int [n][m];
         for(int i=0;i<n;i++){ //populate them
             for(int j=0;j<m;j++){
                 diff[i][j] = rows[i] + cols[j] - (m-rows[i]) - (n-cols[j]); 
             }
         }

         return diff;

    }
}
