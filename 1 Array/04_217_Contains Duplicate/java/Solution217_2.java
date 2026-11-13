/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

// Dùng set ,cỡ O (n)
import java.util.*;
public class Solution217_2 {
    public boolean containsDuplicate (int [] nums)
    {
        Set<Integer> numSet = new HashSet<>();
        for (int n: nums ) // (int i =0; i<n (nums.length); i++)
        {
            if (numSet.contains(n)) // nếu numSet có phần tử n
            {
                return true;
            }
            numSet.add (n); // không có phần tử thì thêm vào nUMsET
        }
        return false;
    }

   

   
}

/*
[1,2,3,1]
set = {}
[1,2,3,1]
 ↑

There is not 1 in set. Add 1 to set.
set = {1}
[1,2,3,1]
   ↑

There is not 2 in set. Add 2 to set.
set = {1,2}
[1,2,3,1]
     ↑

There is not 3 in set. Add 3 to set.
set = {1,2,3}
[1,2,3,1]
       ↑

There is 1 in set.
set = {1,2,3}
return True
 */