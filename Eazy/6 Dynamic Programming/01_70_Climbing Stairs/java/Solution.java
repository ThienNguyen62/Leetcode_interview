import java.util.Scanner;

public class Solution {
    public static int solution(int n) {
        int previous = 1;
        int current = 1;
        for (int step = 2; step <= n; ++step) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
}

/*
Input:
4
Output:
5

Input:
1
Output:
1

Input:
45
Output:
1836311903
*/
