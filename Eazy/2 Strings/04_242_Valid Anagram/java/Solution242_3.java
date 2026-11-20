import java.util.*;
class Solution242_3 {
    public boolean isAnagram3 (String s,String t)
    {
        // kiểm tra độ dài 
        if (s.length() != t.length ())
        {
            return false;
        }
        // tạo hashMap lưu ký tự và số lần xuất hiện
        HashMap<Character,Integer> map = new HashMap<>();
        // đếm kỹ tự của s
        for (int i =0;i<s.length();i++)
        {
            char c=s.charAt(i); // lấy từng kí tự
            if (map.containsKey(c))  // kí tự tồn tại
            {
                map.put(c,map.get(c)+1); // tăng số lần xuất hiện

            }
            else
            {
                map.put(c,1);   // số lần xuất hiện bằng 1
            }
        }

        // kiểm tra chuỗi t có cùng tần suất không
        // nếu kí tự của t không tồn tại trong s thì return false luôn
        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);

            if (!map.containsKey(c)) {
                return false;
            }

            int count = map.get(c) - 1;

            if (count == 0) {
                map.remove(c);
            } else {
                map.put(c, count);
            }
        }

         return map.isEmpty();
    
    }
}
/*  ý tưởng tạo bảng tần suất của s
    dùng t triệt tiêu dần bảng đó
    sau khi triệt tiêu xong mà không còn dư hay thiếu thì thỏa mãn
    map cuối phải rỗng
 */