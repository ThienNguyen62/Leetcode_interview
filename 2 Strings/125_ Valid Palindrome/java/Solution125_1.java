/*
Làm sạch chuỗi và so sánh
loại bỏ kí tự không hợp lệ
đưa về lowercase
kiểm tra palindrome bình thường
time o(n)
space 0(n) */
class Solution125_1 {
    public boolean isPalindrome1 (String s)
    {
        String cleaned = s.replaceAll("[^a-zA-Z0-9","").toLowerCase();
        int left =0;
        int right = cleaned.length()-1;

        while (left < right)
        {
            if(cleaned.charAt(left) != cleaned.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
