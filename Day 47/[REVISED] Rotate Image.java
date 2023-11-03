// simple and readable //with SC - O(n^2), TC - O(n^2)
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];

        //tarnspose the matrix to ans
        for(int i = 0; i < n; i++){

            for( int j = 0; j < n; j++){
                ans[j][n-1-i] = matrix[i][j];
            }
            
        }

        //copy ans to matriz
        for(int i = 0; i < n; i++){

            for( int j = 0; j < n; j++){
                matrix[i][j] = ans[i][j];
            }
            
        }
    }
}

//with SC - O(1) TC - O(n^2)

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j);
            }
        }
        
        reverse2DMatrix(matrix);
    }

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void reverse2DMatrix(int[][] matrix) {
        int numRows = matrix.length;
        for (int i = 0; i < numRows; i++) {
            reverseRow(matrix[i]);
        }
    }

    public static void reverseRow(int[] row) {
        int left = 0;
        int right = row.length - 1;

        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
