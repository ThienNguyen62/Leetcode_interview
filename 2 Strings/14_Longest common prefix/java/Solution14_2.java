//Horizontal Scanning ( quét theo hàng)
/*
lấy prefix chuỗi đầu tiên, rồi thu hẹp khi so các chuỗi tiếp theo
flower
flow
flight
prefix = flower
prefix = flow
prefix = fl

*/
class Solution14_2 {
    public String longestCommonPrefix2 (String[] strs)
    {
      if (strs.length == 0 || strs == null)
      {
        return"";
      }
      String prefix = strs[0];
      for (int i =0;i<strs.length;i++)
      {
        while(strs[i].indexOf(prefix) !=0) // từ không bắt đầu bằng prefix
        {
            prefix = prefix.substring(0,prefix.length()-1); // cắt ngắn 1 kí tự
            if(prefix.isEmpty())
            {
                return "";
            }
        }
        }
        return prefix;
      
    }
    
}
/*
prefix = từ đầu tiên
so sánh prefix với từng từ
nếu từ ko bắt đầu bằng prefix thì cắt ngắn laijcho đến khi khớp
 */