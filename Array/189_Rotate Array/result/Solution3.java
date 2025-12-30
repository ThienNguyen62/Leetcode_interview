
 class Solution3 {
    public void rotate3(int[] nums,int k)
    {
        int n = nums.length;
        k=k%n;
        int [] temp = new int [n];
        // copy last k elements 
        for (int i= 0; i<k;i++)
        {
            temp[i]=nums[n-k+i];
        }
        // copy remaining elements
        for (int i =k; i<n;i++)
        {
            temp[i]=nums[i-k];
        }
        for ( int i =0; i<n;i++)
        {
            nums[i]=temp[i];
        }

    }
}
