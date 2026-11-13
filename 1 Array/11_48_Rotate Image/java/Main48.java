/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]


Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
*/
import java.util.*;
import java.util.Scanner;

public class Main48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập n
        int n;
        do {
            System.out.print("Nhập n (1 ≤ n ≤ 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);

        int[][] matrix = new int[n][n];

        // Nhập ma trận
        System.out.println("Nhập các phần tử ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val; // nhập biến phụ, kiểm tra thỏa mãn thì cho vào matrix
                do {
                    val = sc.nextInt();
                } while (val < -1000 || val > 1000);
                matrix[i][j] = val;
            }
        }

        // Chọn cách
        System.out.println("Chọn cách xoay:");
        System.out.println("1 - Transpose + Reverse");
        System.out.println("2 - Layer by Layer");
        System.out.println("3 - Ma trận phụ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                new Solution48_1().rotate1(matrix);
                break;
            case 2:
                new Solution48_2().rotate2(matrix);
                break;
            case 3:
                new Solution48_3().rotate3(matrix);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }

        // In kết quả
        System.out.println("Ma trận sau khi xoay:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
