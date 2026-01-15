// đệ quy ít dùng
class Solution344_3 {
    public void reverseString3(char[] s) {
        reverseHelper(s, 0, s.length - 1);
    }

    private void reverseHelper(char[] s, int left, int right) {
        if (left >= right) return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseHelper(s, left + 1, right - 1);
    }
}
//Time O(n)
//Space O(n) call stack