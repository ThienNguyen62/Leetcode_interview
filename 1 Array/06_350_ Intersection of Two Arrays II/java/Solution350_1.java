// Hash map
import java.util.*;
class Solution350_1 {
    public int [] intersect1 (int[] nums1 , int[] nums2)
    {
       Map<Integer , Integer> map = new HashMap<>();
       //đếm tần suất nums 1;
       for (int i =0; i< nums1.length;i++)
       {
          int n= nums1[i];
          map.put (n, map.getOrDefault(n,0 )+1);


       }
       List<Integer> result = new ArrayList<>();

       // duyệt nums2
       for (int i=0;i<nums2.length;i++)
       {
        int n = nums2[i];
        if (map.containsKey(n) && map.get(n)>0)
        {
            result.add(n);
            map.put(n,map.get(n) -1);
        }
       }
       // chuyển list -> int []
       int [] ans = new int [result.size()];
       for (int i =0;i< result.size();i++)
       {
          ans[i]= result.get(i);
       }
       return ans;
    }
}
/*
testcase
nums1 = [1, 2, 2, 1]
nums2 = [2, 2]


map 1 = (1=2,2=2) // số - số lần xuất hiện
map 2 =(2=2)






































*/