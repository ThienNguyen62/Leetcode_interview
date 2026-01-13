// Cách 1: vòng lặp đôi
class Solution1_1 {
    public int [] TwoSum1(int []nums, int target)
    {
        for ( int i=0;i<nums.length;i++)
        {
            for (int j =i+1; j<nums.length;j++)
            {
                if (nums[i]== target - nums[j])
                {
                    return new int [] {i,j}; // đúng thì tạo một mảng mới với chỉ số là đáp án
                }
            }
        }
        return new int []{}; // nếu không về mảng rỗng
    }
}
// cách này ko tối ưu
// time O(n^2)
// space O(1)