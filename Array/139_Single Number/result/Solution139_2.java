
// dùng sort phức tạp nlog n
import java.util.*;
 class Solution139_2 {
    public int singleNumber2 (int [] nums)
    {
    Arrays.sort(nums);
    for (int i=0;i<nums.length -1;i+=2)
    {
        // xét trường hợp số lẻ ở đầu hoặc giữa mảng
      if (nums[i] != nums[i-1]){
        return nums[i];  // là số bên trái 
      }
    }
    // xét trường hợp số lẻ ở cuối mảng
    return nums[nums.length-1]; 
}
}

/*
sort
Input:  [4, 1, 2, 1, 2]
Sau sort: [1, 1, 2, 2, 4]

Ý nghĩa:

Nếu 2 số không bằng nhau
→ nums[i] không có cặp
→ chính là số xuất hiện 1 lần

Trường hợp số lẻ nằm cuối mảng
[1,1,2,2,4]


Vòng for chỉ kiểm tra các cặp

Phần tử cuối không có cặp
→ chính là đáp án

6️⃣ CÁC TRƯỜNG HỢP KHÁC
Ví dụ:
[2,1,1]
Sort → [1,1,2]


Vòng for:

i = 0 → 1 == 1 → skip

Return cuối → 2

Ví dụ:
[1,2,2]
Sort → [1,2,2]


i = 0 → 1 != 2

return 1 ngay lập tức
*/
