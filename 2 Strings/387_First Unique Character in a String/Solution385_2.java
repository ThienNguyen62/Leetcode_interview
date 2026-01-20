// dùng hashmap
import java.util.*;
class Solution385_2 {
    public static int firstUniqChar2(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        // số lần xuất hiện
        for ( int i =0; i<s.length (); i++)
        {
            char currentChar = s.charAt(i);

            // nếu ký tự chưa xuất hiện trong map
            if ( map.containsKey(currentChar)== false)
            {
                map.put(currentChar,1);

            }
            else
            {
                int oldCount = map.get(currentChar);
                map.put(currentChar, oldCount +1);

            }
        }
         for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            int count = map.get(currentChar);

            // Nếu số lần xuất hiện đúng bằng 1
            if (count == 1) {
                return i;
            }
        }

        // Không có ký tự nào thỏa mãn
        return -1;
    }
}
