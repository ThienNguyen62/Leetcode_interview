// Brute Force
// ý tưởng trượt needle qua haystack
// duyệt từ i đến 0 với mỗi i so sánh từng kí tự của needle , nếu trung thì return i

class Solution28_1 {
    public int strStr1 (String haystack, String needle)
    {
        for(int i =0;i<= haystack.length()-needle.length();i++)
        {
        int j=0; //con trỏ needly
        while (j<needle.length() &&
               haystack.charAt(i+j)== needle.charAt(j))
               {
                j++;
               }
        if (j== needle.length())// kiểm tra đã khớp toán bộ chưa
        {
            return i;
        }
        }
    return -1;
    }
}
// chay vi du
/*
+ vòng lặp đầu tiên, i là vị trí bắt đầu so sánh trong haystack
haystack = "sadbutsad"
needle   = "sad"
s a d b u t s a d
0 1 2 3 4 5 6 7 8

needle.length()=3
chỉ cần xét vị trí thứ 6, do thứ 7 =ad ko đủ để so sánh

khởi tạo j duyệt needle
needle = s a d
         0 1 2



















*/