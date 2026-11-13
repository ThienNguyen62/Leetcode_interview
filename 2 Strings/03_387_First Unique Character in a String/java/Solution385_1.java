import java.util.*;
// dùng mảng
class Solution385_1 {
    public int firstUniqChar1(String s) {
        int [] count = new int [26]; // 26 kí tự
        // bước 1 đếm số lần xuất hiện 
        for ( int i =0;i<s.length (); i++)
        {
            count [s.charAt (i) -'a']++;
        }
        // bước 2 tìm ký tự đầu tiên có count =1
        for ( int i =0; i<s.length(); i++)
        {
            if (count[s.charAt(i) -'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}


// nhập số vào mảng count, nếu giá trị khác 1 đầu tiên thì chọn
//trừ a vì đưa giá trị về số nguyên
// 'a' -'a' = 0 là index của a
// count [c-'a']++ vd = 2
/*
vd s = "leetcode"
i = 0 , 'l' -'a' =11
count [11]++
i=1  
'e' -'a' =4
count[4]++
c = 'e'
index = 4
count[4]++
c = 't'
index = 't' - 'a' = 19
count[19]++
c = 'c'
index = 'c' - 'a' = 2
count[2]++
c = 'o'
index = 'o' - 'a' = 14
count[14]++
c = 'd'
index = 'd' - 'a' = 3
count[3]++
c = 'e'
index = 4
count[4]++


c : 1   → count[2]
d : 1   → count[3]
e : 3   → count[4]
l : 1   → count[11]
o : 1   → count[14]
t : 1   → count[19]



*/