// xoay theo từng vòng layer to layer
// cách này sẽ hoán từng layer, là các vòng bọc nhau, (không tính ô giữa nếu chỉ có ô giữa vd 3x3)
//  vd 4x4 sẽ có hai layer
// nguyên tắc top-> right->bottom->left->top
/*
top    ← left
left   ← bottom
bottom ← right
right  ← top
 */
import java.util.*;
class Solution48_2 {
    public void rotate2(int [][] matrix)
    {
        int n =matrix.length;
     
        for ( int layer =0; layer <n /2; layer ++)
        {
            int first = layer; // biên trái
            int last = n-1-layer; // biên phải
            for ( int i =first;i<last; i++)
            {
                int offset = i -first; // khoảng cách của điểm đang xét so với góc trái trên của layer
                int top = matrix[first][i];

                matrix[first][i] = matrix [last - offset][first];
                matrix[last - offset][first]= matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }
}


/*
1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16

layer 0, first =0, last =3
i=0
top    = (0,0) = 1
left   = (3,0) = 13
bottom = (3,3) = 16
right  = (0,3) = 4

xoay
(0,0) ← 13
(3,0) ← 16
(3,3) ← 4
(0,3) ← 1
ma trận
13  2   3   1
5   6   7   8
9  10  11  12
16 14  15  4

i=1
top    = (0,1) = 2
left   = (2,0) = 9
bottom = (3,2) = 15
right  = (1,3) = 8
xoay
(0,1) ← 9
(2,0) ← 15
(3,2) ← 8
(1,3) ← 2
ma trận
13  9   3   1
5   6   7   2
15 10  11  12
16 14   8   4

i=2
top    = (0,2) = 3
left   = (1,0) = 5
bottom = (3,1) = 14
right  = (2,3) = 12
xoay
(0,2) ← 5
(1,0) ← 14
(3,1) ← 12
(2,3) ← 3
ma trạn
13  9   5   1
14  6   7   2
15 10  11   3
16 12   8   4


layer 1 first =1 last = 2

i=1
top    = (1,1) = 6
left   = (2,1) = 10
bottom = (2,2) = 11
right  = (1,2) = 7

xoay
(1,1) ← 10
(2,1) ← 11
(2,2) ← 7
(1,2) ← 6
ma trận cuối
13   9   5   1
14  10   6   2
15  11   7   3
16  12   8   4





























*/