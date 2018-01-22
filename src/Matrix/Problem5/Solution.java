package Matrix.Problem5;

public class Solution {
    private static boolean isColumnValid(char[][] board, int colIndex) {
        boolean[] taken = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char cell = board[i][colIndex];
            if (cell != '.') {
                if (taken[cell - '1']) {
                    return false;
                } else {
                    taken[cell - '1'] = true;
                }
            }
        }
        return true;
    }

    private static boolean isRowValid(char[][] board, int rowIndex) {
        boolean[] taken = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char cell = board[rowIndex][i];
            if (cell != '.') {
                if (taken[cell - '1']) {
                    return false;
                } else {
                    taken[cell - '1'] = true;
                }
            }
        }
        return true;
    }

    private static boolean isBoxValid(char[][] board, int boxIndex) {
        boolean[] taken = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char cell = board[boxIndex / 3 * 3 + i / 3][boxIndex % 3 * 3 + i % 3];
            if (cell != '.') {
                if (taken[cell - '1']) {
                    return false;
                } else {
                    taken[cell - '1'] = true;
                }
            }
        }
        return true;
    }

    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isColumnValid(board, i) || !isRowValid(board, i) || !isBoxValid(board, i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] given =
                {
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                };
        System.out.println("Given sudoku is " + (isValidSudoku(given) ? "valid" : "invalid"));
    }
}
