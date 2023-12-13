class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length; 
        
        int[] rowSum = new int[m]; 
        int[] colSum = new int[n]; 
        int specialCount = 0; 
        
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }
        
 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1) {
                    specialCount++;
                }
            }
        }
        
        return specialCount;
    }
}
