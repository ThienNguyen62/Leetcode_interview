/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according
 to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
Example 1:
Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. 
Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 

Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.


chủ yếu tìm hiểu bảng này có phạm luật không, không cần giải
*/
/*
❓ Câu 1:

Số này đã xuất hiện trong HÀNG này chưa?

❓ Câu 2:

Số này đã xuất hiện trong CỘT này chưa?

❓ Câu 3:

Số này đã xuất hiện trong Ô 3×3 này chưa? */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[9][9];

        System.out.println("Nhap bang Sudoku (9 dong, moi dong 9 ky tu):");
        for (int i = 0; i < 9; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        System.out.println("Chon cach giai:");
        System.out.println("1. HashSet");
        System.out.println("2. 3 Boolean Array");
        int choice = sc.nextInt();

        boolean result = false;

        switch (choice) {
            case 1:
                Solution36_1 s1 = new Solution36_1();
                result = s1.isValidSudoku1(board);
                break;

            case 2:
                Solution36_2 s2 = new Solution36_2();
                result = s2.isValidSudoku2(board);
                break;

            default:
                System.out.println("Lua chon khong hop le!");
                return;
        }

        System.out.println("Ket qua: " + result);
    }
}
