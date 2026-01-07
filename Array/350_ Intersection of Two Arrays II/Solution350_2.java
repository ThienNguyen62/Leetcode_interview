import java.util.*;
// cho hai danh sách xếp theo thứ tự, tìm các số trùng nhau
class Solution350_2 {
    public int [] intersect2 (int [] nums1, int [] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0,j=0;
        List<Integer> result = new ArrayList<>(); // tạo 1 danh sách mảng động
        while (i<nums1.length && j< nums2.length)
        {
            if ( nums1[i] == nums2[j])
            {
                result.add(nums1[i]);
                i++;
                j++;
            
            }
            else if ( nums1[i]< nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }

        }
        int[] ans = new int[result.size()]; // tạo mảng có số phần tử bằng số đồ đã nhét túi result
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k); // lấy phần tử thử k trong result bỏ vào ô thứ k trong ans
        }

        return ans; // trả về mảng ans
    }
}
/*
Đặt 2 con trỏ ở hai đầu A VÀ b
NẾU A[i]==b[j]
ghi nhận rồi rời con trỏ đi
nếu a[i]<b[j]
số a nhỏ hơn số b dời số a
tương tự nếu a lớn hơn thì dời b


quan trọng phải sort trước*/
