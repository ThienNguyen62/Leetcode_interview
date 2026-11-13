//Vertical Scanning ( quet theo cot)
/*
so sánh từng kí tự theo chiều dọc của các chuỗi
vd 
flower
flow
flight 

f  f  f   -> giống
l  l  l   -> giống
o  o  i   -> khác

từ duy , lấy chuỗi đầu tiên làm chuẩn, duyệt từng kí tự
so sánh với các chuỗi còn lại
nếu khác kí tự hoặc chuỗi ngắn hơn thì dừng và trả về prefix
lấy chuỗi 1 làm tham chiếu, so sánh từng kí tự của nó với chuỗi còn lại
time o(s) với s là tổng ký tự các chuỗi
space o(1)
*/
class Solution14_1 {
    public String longestCommonPrefix1(String [] strs)
    {
       if (strs==null || strs.length ==0)
       {
        return"";
       }
       for(int i =0;i<strs[0].length();i++)
       {
        // duyệt từng kí tự chuỗi đầu tiên
        char c = strs[0].charAt(i); // lấy kí tự tại vị trí i
        for(int j=1;j<strs.length;j++)  // duyệt các chuỗi còn lại
        {
            if (i==strs[j].length() || strs[j].charAt(i)!=c)// điều kiện chuỗi ngắn hơn prefix và ký tự khác nhau
            {
                return strs[0].substring(0,i);
                // lấy prefix từ chuỗi đầu đến vị trí i
            }
        }
        }
        return strs[0];
       
    }
}


/*
xét 2 điều kiện
if (i == strs[j].length() || strs[j].charAt(i) != c)
th1 chuỗi ngắn hơn prefix
i== strs[j].length()
["flower","fl"]
i = 0 → ok
i = 1 → ok
i = 2
"fl".length() = 2 -> prefix tối đa là fl

th2 ký tự khác nhau
strs[j].charAt(i) != c

flower
flow
flight
i=2
flower[2] = o
flow[2]   = o
flight[2] = i

dừng ở fl

chọn 1 chuỗi làm chuẩn
duyệt từng ký tự
so với tất cả chuỗi khác
dừng khi khác hoặc chuỗi hết






*/