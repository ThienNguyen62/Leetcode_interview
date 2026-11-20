import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
    public static void solution(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for (int[] row : matrix) {
            for (int left = 0, right = n - 1; left < right; left++, right--) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int[] row : matrix) {
            for (int col = 0; col < n; col++) {
                row[col] = scanner.nextInt();
            }
        }

        solution(matrix);
        for (int[] row : matrix) {
            StringJoiner output = new StringJoiner(" ");
            for (int value : row) {
                output.add(Integer.toString(value));
            }
            System.out.println(output);
        }
    }
}

/*
Input:
2
8 3
2 -1
Output:
2 8
-1 3

Input:
1
-7
Output:
-7

Input:
3
0 1 2
3 4 5
6 7 8
Output:
6 3 0
7 4 1
8 5 2
*/
