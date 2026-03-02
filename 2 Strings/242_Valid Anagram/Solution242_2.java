// dùng mảng
// tối ưu nếu chỉ có chữ cái thương
// mảng 26 kí tự, tăng khi gặp kí tự ở s , giảm khi gặp kí tự ở t, sau cùng nếu tất cả bằng 0 thì thỏa mãn
// độ phức tạp o(n)
// không gian O(1)
class Solution242_2 {
    public boolean isAnagram2(String s, String t)
    {
        // kiểm tra độ dài
        if (s.length() != t.length())
        {
            return false;
        }
        // mảng 26 kí tự cho a đến z
        int [] count = new int [26];
        // duyệt cùng lúc cả hai chuỗi
        for (int i = 0; i<s.length();i++)
        {
            // tăng số lần xuất hiện của kí tự của s trong mảng count
            count [s.charAt(i)-'a']++;
            // giảm số lần xuất hiện của kí tự của t trong mảng count
            count [t.charAt(i)-'a']--;

        }
        // kiểm tra mảng count sau khi thay đổi
        for (int i =0; i<count.length;i++)
        {
            if (count[i] >0)
            {
                return false;
            }
            if (count[i] <0)
            {
                return false;
            }
            
        }
        return true;
    }
}
// lấy độ dài mảng thì là array.length vì length là field
// lấy độ dài chuỗi là string.length() vì length là method