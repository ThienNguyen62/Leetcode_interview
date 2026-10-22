// built in
// không dùng thuật toán, dùng luôn thư viện
import java.util.*;
class Solution344_4 {
    public void reverseString4 ( char [] s)
    {
      String reversed = new StringBuilder( new String (s)).reverse().toString();
       for ( int i =0; i<s.length;i++)
       {
        s[i] = reversed.charAt(i);
       }
    }
}
// Time O(n)
// Space O(n)