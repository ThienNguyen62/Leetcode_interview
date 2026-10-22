// đây là cách không in place, chỉ để hiểu
class Solution344_1
 
{
    public void reverseString1( char [] s)
    {
        int n = s.length;
        char [] temp = new char [n];
        for ( int i =0; i<n;i++)
        {
            temp[i] = s[n-1-i];

        }
        // copy ngược vào mảng gốc
        for ( int i =0;i<n;i++)
        {
            s[i]=temp [i];
        }
    }
}
/*
time O(n)
space O(n)
 */