class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    int num = currentChar - '1';
                    if (rowCheck[num]) {
                        return false; // Duplicate in the same row
                    }
                    rowCheck[num] = true;
                }
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            boolean[] colCheck = new boolean[9];
            for (int i = 0; i < 9; i++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    int num = currentChar - '1';
                    if (colCheck[num]) {
                        return false; // Duplicate in the same column
                    }
                    colCheck[num] = true;
                }
            }
        }

        // Check 3x3 sub-grids
        for (int box = 0; box < 9; box++) {
            boolean[] boxCheck = new boolean[9];
            for (int i = box / 3 * 3; i < box / 3 * 3 + 3; i++) {
                for (int j = (box % 3) * 3; j < (box % 3) * 3 + 3; j++) {
                    char currentChar = board[i][j];
                    if (currentChar != '.') {
                        int num = currentChar - '1';
                        if (boxCheck[num]) {
                            return false; // Duplicate in the same sub-grid
                        }
                        boxCheck[num] = true;
                    }
                }
            }
        }

        return true; // The Sudoku board is valid
    }
}
