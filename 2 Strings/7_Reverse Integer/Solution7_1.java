import java.util.*;
// lấy chữ số cuối của x rồi ghép vào cuối số mới cho đến khi x =0
// không thể dùng string, kiểm soát tràn số, số có thể âm -> toán học

//Integer.MAX_VALUE =  2147483647
//Integer.MIN_VALUE = -2147483648




class Solution7_1 {
    public int reverse ( int x)
    {
        int rev =0 ; // số bị đảo ngược
        while ( x!= 0)
        {
            int digit = x%10; // lấy chữ số cuối
            x/=10 ; // xóa chữ số cuối
            if ( rev > Integer.MAX_VALUE /10 ||
                (rev== Integer.MAX_VALUE /10 && digit >7))
                {
                    return 0;
                }
                
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                     return 0;
                }
            rev=rev*10 +digit;
        }
        return rev;
    }
}
// giải thích điều kiện
/*
TH1: res > Integer.MAX_VALUE /
vd : rev =214748365
     rev *10 =...50 >47
TH2 res = Integer.MAX_VALUE /10 và digit >7
    nếu digit =8 thì lớn hơn max

*/


/*
x=123
rev =0
vòng 1
gigit = x%10;
digit=123%10=3
x/=10 = 123/10=12

rev = 0-> an toàn
rev = 0*10+3=3
x=12
rev =3


vòng 2
x=12/10=1
digit =12%10=2
rev = 3 nhỏ an toàn
rev = 3*10+2=32
x=1
rev=32

vòng 3
x=1/10=0
digit =1%10=1
rev=32-> an toàn
rev=32*10+2 =321
x=0
rev=321










*/
