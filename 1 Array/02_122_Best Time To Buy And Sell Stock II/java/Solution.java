import java.util.Scanner;

public class Solution {
    public static int solution(int[] prices) {
        int profit = 0;
        for (int day = 1; day < prices.length; day++) {
            int increase = prices[day] - prices[day - 1];
            if (increase > 0) {
                profit += increase;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int[] prices = new int[days];
        for (int day = 0; day < days; day++) {
            prices[day] = scanner.nextInt();
        }
        System.out.println(solution(prices));
    }
}

/*
Input:
5
2 5 1 4 4
Output:
6

Input:
1
8
Output:
0

Input:
5
9 7 7 3 0
Output:
0
*/
