// Dùng one pass hashmap
/*
Ý TƯỞNG
 1 tính phần bù
 2 kiểm tra phần bù đã xuất hiện trước đó chưa
 3 nếu có thì đạt
 4 nếu chưa thì lưu số hiện tại vào HashMap */
import java.util.*;
class Solution1_3 {
    public int[] TwoSum3 (int [] nums, int target)
    {
        Map <Integer,Integer> map = new HashMap <>();
        for (int i =0; i < nums.length;i++)
        {
            int complement = target - nums[i];
            if (map.containsKey(complement))
            {
                return new int [] {map.get(complement),i};
            }
        // put sau
        map.put(nums[i],i);
        }
        return new int []{};
    }
}
/*
nums = [2, 7, 11, 15]
target = 9


i= 0
nums[i] = 2
complement = 7
-> map rỗng . map(2,0)   map {2->0}

i=1
nums[i] = 7
complement = 2
thỏa mãn  vì trong map có 2
return {0,1}














*/
