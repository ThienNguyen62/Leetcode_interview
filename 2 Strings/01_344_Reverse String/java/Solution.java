import java.util.Scanner;

public class Solution {
    public static void solution(char[] s) {
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        solution(s);
        System.out.println(s);
    }
}

/*
Input:
Ab!?
Output:
?!bA

Input:
x
Output:
x

Input:
a b
Output:
b a
*/
