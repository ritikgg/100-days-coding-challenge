public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int ROWS = img.length;
        int COLS = img[0].length;
        int[][] res = new int[ROWS][COLS];

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                int total = 0;
                int cnt = 0;
                
                for (int i = r - 1; i <= r + 1; i++) {
                    for (int j = c - 1; j <= c + 1; j++) {
                        if (i < 0 || i == ROWS || j < 0 || j == COLS) {
                            continue;
                        }
                        total += img[i][j];
                        cnt++;
                    }
                }
                res[r][c] = total / cnt;
            }
        }

        return res;
    }
}
