// sử dụng sort
/*
sắp xếp các chuỗi theo kí tự từ điển
các chuỗi giống nhau sẽ nằm gần nhau
chuỗi khác nhau nhiều nhất nằm ở đầu và cuối
prefix chung của toàn bộ mảng
=
prefix chung của chuỗi đầu + chuỗi cuối

*/
import java.util.*;
class Solution14_3
{
    public String longestCommonPrefix3(String [] strs)
    {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i =0;
        while ( i <first.length () &&
                i<last.length() &&
                first.charAt(i)== last.charAt(i))
            {
                i++;
            }
        return first.substring(0,i);
    }
}
// 1. sort mảng
// 2. so sánh chuỗi đầu và cuối
// 3. lấy prefix chung của 2 chuỗi đó