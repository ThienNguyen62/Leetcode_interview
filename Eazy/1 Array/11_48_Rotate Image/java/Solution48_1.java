import java.util.*;
class Solution48_1 {
   public void rotate1 ( int [][] matrix)
   {
    int n = matrix.length;
    // transpose lấy đối xứng qua đường chéo chính
    for ( int i =0; i<n;i++)
    {
        for (int j =i+1;j<n;j++)
        {
            int temp = matrix[i][j];
            matrix[i][j]= matrix [j][i];
            matrix[j][i] = temp;
        }
    }
   
   // reverse từng hàng
   for ( int i =0; i<n;i++)
   {
      int left =0, right =n- 1;
      while ( left < right ) // hoán phần tử từng hàng
      {
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
      }
   }
}
    
}
/*
vd :
1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16
chỉ số
(0,0) (0,1) (0,2) (0,3)
(1,0) (1,1) (1,2) (1,3)
(2,0) (2,1) (2,2) (2,3)
(3,0) (3,1) (3,2) (3,3)

hoán [i][j] với [j][i]
đường chéo i == j giữa nguyên

i=0
1   5   9   13
2   6   7   8
3  10  11  12
4  14  15  16

i=1
1   5   9   13
2   6  10  14
3   7  11  12
4   8  15  16

i=2
1   5   9   13
2   6  10  14
3   7  11  15
4   8  12  16

i=3 dừng
1   5   9   13
2   6  10  14
3   7  11  15
4   8  12  16

reverse từng hàng -> kết quả




























 */
