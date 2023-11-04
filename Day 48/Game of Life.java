public class Solution {
    public void gameOfLife(int[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;

        int[] dx = {1, -1, 1, -1, 0, 0, 1, -1};
        int[] dy = {1, -1, -1, 1, 1, -1, 0, 0};

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int countLiveNeighbors = 0;

                for (int i = 0; i < 8; i++) {
                    int currX = row + dx[i];
                    int currY = col + dy[i];
                    if (isValidNeighbor(currX, currY, board) && Math.abs(board[currX][currY]) == 1) {
                        countLiveNeighbors++;
                    }
                }

                if (board[row][col] == 1 && (countLiveNeighbors < 2 || countLiveNeighbors > 3)) {
                    board[row][col] = -1;
                }
                if (board[row][col] == 0 && countLiveNeighbors == 3) {
                    board[row][col] = 2;
                }
            }
        }

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] >= 1) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }

    private boolean isValidNeighbor(int x, int y, int[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;
        return x >= 0 && x < ROWS && y >= 0 && y < COLS;
    }
}
