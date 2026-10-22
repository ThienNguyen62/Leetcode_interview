// Two pass Hash Table
/*
Pass 1: Lưu toàn bộ giá trị + chỉ số vào HashMap

Pass 2: Với mỗi phần tử, tìm phần bù (target - nums[i])

Duyệt từng phần tử x của mảng, phần bù = target -x, nếu phần bù thuộc Hashmap thì đạt ( điều kiện ko trùng index
với phần tử hiện tại)
*/

// HashMap <giá trị, chỉ số >
import java.util.*;
class Solution1_2 {
    public int [] TwoSum2 (int [] nums, int target)
    {
        Map <Integer,Integer> map = new HashMap <>();
        // Pass 1 : lưu toàn bộ giá trị và index
        for ( int i =0;i<nums.length;i++)
            {
                map.put(nums[i],i);  // lưu giá trị và chỉ số
            }            
        // Pass 2 : tìm cặp phù hợp
        for ( int i =0;i<nums.length;i++)
        {
            int complement = target - nums[i];// phần bù
            if ( map.containsKey(complement) && map.get(complement) !=i)
                // kiểm tra có tồn tại complement trong mảng không và chỉ số của nó phải khác index hiện tại của i
            {
                return new int [] {i,map.get(complement)};
            }
        }
        return new int []{};
    }
}
