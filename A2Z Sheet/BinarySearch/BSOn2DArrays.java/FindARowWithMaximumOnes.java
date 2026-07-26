/*
Approach:
1. Start from the top-right corner of the matrix.
2. If the current element is 1, update the answer to the current row and move
   left, as this row may contain more 1s.
3. If the current element is 0, move down to the next row since all elements
   to the left are also 0.
4. Continue until either all rows or all columns are traversed.
5. The last updated row index is the row with the maximum number of 1s.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/
class FindARowWithMaximumOnes {
    public int rowWithMax1s(int[][] mat) {
    //     int max=0;
    //     int maxin=-1;
    //    for(int i=0;i<mat.length;i++){
    //     int cnt=0;
    //     for(int j=0;j<mat[i].length;j++){
    //         if(mat[i][j]==1){
    //             cnt++;
    //         }
    //     }
    //     if(max<cnt){
    //         max=cnt;
    //         maxin=i;
    //     }
    //    }
    //    return maxin;


//         int ans = -1;
//         int max = 0;
//         int m = mat[0].length;

//         for(int i = 0; i < mat.length; i++) {

//             int low = 0;
//             int high = m - 1;
//             int firstone = -1;

//             while(low <= high) {

//                 int mid = low + (high - low) / 2;

//                 if(mat[i][mid] == 0) {
//                     low = mid + 1;
//                 } else {
//                     firstone = mid;
//                     high = mid - 1;
//                 }
//             }

//             int ones = 0;
//             if(firstone != -1) {
//                 ones = m - firstone;
//             }

//             if(ones > max) {
//                 max = ones;
//                 ans = i;
//             }
//         }

//         return ans;
//     }
// }

int ans = -1;
int i = 0;
int j = mat[0].length - 1;

while(i < mat.length && j >= 0){

    if(mat[i][j] == 1){
        ans = i;
        j--;
    }else{
        i++;
    }
}

return ans;
    }
}
       
