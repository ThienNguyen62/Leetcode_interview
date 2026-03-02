// use array
// ý tưởng là hai chuỗi sắp xếp lại giống nhau
// độ phức tạp O(nlogn)
// không gian o(n)
import java.util.*;
class Solution242_1 {
    public boolean isAnagram1(String s, String t)
    {
     // nếu độ dài khác nhau thì không phải anagram
     if (s.length() != t.length())
     {
        return false;
     }
     // chuyển chuỗi thành mảng kí tự
     char [] arr1 = s.toCharArray ();
     char [] arr2 = t.toCharArray();
     // sắp xếp amngr
     Arrays.sort(arr1);
     Arrays.sort(arr2);
     // so sánh hai mảng sau khi sort
     return Arrays.equals(arr1,arr2);
    }
}
// code nhanh