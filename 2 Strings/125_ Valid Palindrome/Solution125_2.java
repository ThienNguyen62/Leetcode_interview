// dùng hai con trỏ tối ưu nhất
// kí tự không hợp lệ thì skip
// hợp lệ thì so lánh lowercase
//time o(n)
//space o(1)
class Solution125_2 {

    public boolean isPalindrome2(String s)
    {
        // hàm character.isLetterOrDigit trả về true nếu là chữ cái và chữ số, false nếu còn lại
        // hàm thay 3 dòng điều kiện thuộc a-x,A-Z và 0-9
        int left =0;  // con trỏ đầu
        int right = s.length()-1;  // con trỏ cuối

        while (left <right)
        {
            // kiểm tra nếu kí tự không hợp lệ thì con trỏ nhảy qua
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left++; 
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            // so hai kí tự sau khi chuyển về chữ thường
            if(Character.toLowerCase(s.charAt(left))!=
               Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            // thỏa mán thì tiếp tục chạy
            left++;
            right--;
        }
        return true;
    }
}
